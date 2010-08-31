package com.logica.hummingbird.framebrokerviewer.views;

import org.eclipse.core.commands.ParameterType;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.part.ViewPart;

import com.logica.hummingbird.framebrokerviewer.FrameBrokerViewerPlugin;
import com.logica.hummingbird.spacesystemmodel.Container;
import com.logica.hummingbird.spacesystemmodel.ContainerImpl;
import com.logica.hummingbird.spacesystemmodel.exceptions.InvalidParameterTypeException;
import com.logica.hummingbird.spacesystemmodel.parameters.IntegerParameter;
import com.logica.hummingbird.spacesystemmodel.parameters.behaviours.IntegerUnsignedBehaviour;
import com.logica.hummingbird.spacesystemmodel.parameters.types.NumberParameterType;
import com.logica.hummingbird.tmframeprovider.IFrameProvider;


/**
 * @author Mark Doyle
*/
public class FrameView extends ViewPart {
	public final static String VIEW_ID = "com.logica.hummingbird.framebrokerviewer.views.FrameView";
	
	private Tree tree;
	private SashForm mainComposite;
	private TreeViewer frameTreeViewer;
	
	/**
	 * Provides the Frames to the viewers.
	 */
	IFrameProvider frameProvider;
	
	Container frame;
	

	public FrameView() {
		System.out.println("Getting Frame provider service");
		
		frameProvider = (IFrameProvider) FrameBrokerViewerPlugin.getFrameProviderServices().getService();
		
		System.out.println("Frame view instantiation: frameProviderServices tracking count = " + FrameBrokerViewerPlugin.getFrameProviderServices().getTrackingCount());

		System.out.println("Initialising test mock up data - REMOVE THIS!  FOR TESTING THE VIEW WITHOUT REAL DATA ONLY!");
		testDataInit();
	}
	
	private void testDataInit() {
		frame = new ContainerImpl("Test Frame", "Mock Test Frame", "Mock Frame created for testing");
		((ContainerImpl)frame).addContainer(new ContainerImpl("Test Frame Header", "Mock Test Frame Header", "Mock Frame Header created for testing"));
		ContainerImpl framePacket = new ContainerImpl("Test Frame Packet", "Mock Test Frame Packet", "Mock Frame Packet created for testing");
		((ContainerImpl)frame).addContainer(framePacket);
		((ContainerImpl)frame).addContainer(new ContainerImpl("Test Frame Tail", "Mock Test Frame Tail", "Mock Frame Tail created for testing"));
		
		ContainerImpl packetHeader = new ContainerImpl("Test Packet Header", "Mock Test Packet Header", "Mock Packet Header created for testing");
		framePacket.addContainer(packetHeader);
		ContainerImpl packetBody = new ContainerImpl("Test Packet Body", "Mock Test Packet Body", "Mock Packet Body created for testing");
		framePacket.addContainer(packetBody);
		
		NumberParameterType testType32bitInt = null;
		try {
			testType32bitInt = new NumberParameterType("test type", "test type", "32bit int test type", new IntegerUnsignedBehaviour(32, true), 0);
		}
		catch (InvalidParameterTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		packetHeader.addContainer(new IntegerParameter("Test Apid param", "test parameter", "Test parameter created for testing", testType32bitInt, 555));
		packetBody.addContainer(new IntegerParameter("Test param", "test parameter", "Test parameter created for testing", testType32bitInt, 4));
		packetBody.addContainer(new IntegerParameter("Test param2", "test parameter", "Test parameter created for testing", testType32bitInt, 7));
	}

	@Override
	public void createPartControl(Composite parent) {
		GridLayout parentLayout = new GridLayout();
		parentLayout.makeColumnsEqualWidth = true;
		parent.setLayout(parentLayout);
		//START >>  mainComposite
		mainComposite = new SashForm(parent, SWT.NONE);

		final Composite composite = new Composite(mainComposite, SWT.NONE);
		composite.setLayout(new GridLayout());
		frameTreeViewer = new TreeViewer(composite, SWT.BORDER);
		tree = frameTreeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		tree.setHeaderVisible(true);

		final Composite composite_1 = new Composite(mainComposite, SWT.NONE);
		composite_1.setLayout(new GridLayout());

		final Group detailsGroup = new Group(composite_1, SWT.NONE);
		detailsGroup.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true));
		detailsGroup.setText("Details");
		detailsGroup.setLayout(new GridLayout());

		final Label label = new Label(detailsGroup, SWT.NONE);
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		label.setText("Label");
		GridLayout mainCompositeLayout = new GridLayout();
		mainCompositeLayout.numColumns = 2;
		mainCompositeLayout.makeColumnsEqualWidth = true;
		GridData mainCompositeLData = new GridData();
		mainCompositeLData.verticalAlignment = GridData.FILL;
		mainCompositeLData.grabExcessVerticalSpace = true;
		mainCompositeLData.grabExcessHorizontalSpace = true;
		mainCompositeLData.horizontalAlignment = GridData.FILL;
		mainComposite.setLayoutData(mainCompositeLData);
		mainComposite.setLayout(mainCompositeLayout);
		mainComposite.setWeights(new int[] {239, 239 });
		GridData frameTreeViewerLData = new GridData();
		frameTreeViewerLData.grabExcessVerticalSpace = true;
		frameTreeViewerLData.grabExcessHorizontalSpace = true;
		frameTreeViewerLData.verticalAlignment = GridData.FILL;
		frameTreeViewerLData.horizontalAlignment = GridData.FILL;
		
		ContainerImpl treeRoot = new ContainerImpl("GUI root container", "Mock GUI Container for root", "GUI Container used to put the real data into.  This allows us to \"see\" the Root frame");
		treeRoot.addContainer(frame);
		
		frameTreeViewer.getControl().setLayoutData(frameTreeViewerLData);
		frameTreeViewer.setContentProvider(new ContainerContentProvider());
		frameTreeViewer.setLabelProvider(new ContainerLabelProvider());
		frameTreeViewer.setInput(treeRoot);
		frameTreeViewer.expandAll();

		initializeToolBar();

		// Set the provider service name in the status bar
		String statusLineMessage = null;
		if(frameProvider != null) {
			statusLineMessage = "Frames provided by the " + frameProvider.getFrameProviderName() + " adapter";
		}
		else {
			statusLineMessage = "Warning: No Frame provider services available";
		}
		getViewSite().getActionBars().getStatusLineManager().setMessage(statusLineMessage);
		createActions();
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	private void initializeToolBar() {
		IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
	}
	private void createActions() {
	}

	public IFrameProvider getFrameProvider() {
		return frameProvider;
	}

	public void setFrameProvider(IFrameProvider frameProvider) {
		this.frameProvider = frameProvider;
	}

}
