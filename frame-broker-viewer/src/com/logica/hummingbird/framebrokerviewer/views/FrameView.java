package com.logica.hummingbird.framebrokerviewer.views;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.part.ViewPart;

import com.logica.hummingbird.framebroker.Container;
import com.logica.hummingbird.framebroker.IContainer;
import com.logica.hummingbird.framebroker.parameters.IntegerParameter;
import com.logica.hummingbird.framebroker.parameters.ParameterType;
import com.logica.hummingbird.framebroker.parameters.ParameterType.eParameterType;
import com.logica.hummingbird.framebrokerviewer.FrameBrokerViewerPlugin;
import com.logica.hummingbird.framebrokerviewer.views.ContainerLabelProvider;
import com.logica.hummingbird.tmframeprovider.IFrameProvider;
import com.swtdesigner.ResourceManager;


/**
 * @author Mark Doyle
*/
public class FrameView extends ViewPart {
	private Tree tree;
	private Composite mainComposite;
	private TreeViewer frameTreeViewer;
	
	/**
	 * Provides the Frames to the viewers.
	 */
	IFrameProvider frameProvider;
	
	IContainer frame;
	

	public FrameView() {
		System.out.println("Getting Frame provider service");
		frameProvider = (IFrameProvider) FrameBrokerViewerPlugin.getFrameProviderServices().getService();
		
		System.out.println("Frame view instantiation: frameProviderServices tracking count = " + FrameBrokerViewerPlugin.getFrameProviderServices().getTrackingCount());

		System.out.println("Initialising test mock up data - REMOVE THIS!  FOR TESTING THE VIEW WITHOUT REAL DATA ONLY!");
		testDataInit();
		System.out.println(frameProvider.getFrameProviderName());
	}
	
	private void testDataInit() {
		frame = new Container("Test Frame", "Mock Test Frame", "Mock Frame created for testing");
		((Container)frame).addContainer(new Container("Test Frame Header", "Mock Test Frame Header", "Mock Frame Header created for testing"));
		Container framePacket = new Container("Test Frame Packet", "Mock Test Frame Packet", "Mock Frame Packet created for testing");
		((Container)frame).addContainer(framePacket);
		((Container)frame).addContainer(new Container("Test Frame Tail", "Mock Test Frame Tail", "Mock Frame Tail created for testing"));
		
		Container packetHeader = new Container("Test Packet Header", "Mock Test Packet Header", "Mock Packet Header created for testing");
		framePacket.addContainer(packetHeader);
		Container packetBody = new Container("Test Packet Body", "Mock Test Packet Body", "Mock Packet Body created for testing");
		framePacket.addContainer(packetBody);
		
		ParameterType testType32bitInt = new ParameterType("test type", "test type", "32bit int test type", eParameterType.INTEGER, true, 0, 32);
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
		mainComposite = new Composite(parent, SWT.NONE);
		GridLayout mainCompositeLayout = new GridLayout();
		mainCompositeLayout.makeColumnsEqualWidth = true;
		GridData mainCompositeLData = new GridData();
		mainCompositeLData.verticalAlignment = GridData.FILL;
		mainCompositeLData.grabExcessVerticalSpace = true;
		mainCompositeLData.grabExcessHorizontalSpace = true;
		mainCompositeLData.horizontalAlignment = GridData.FILL;
		mainComposite.setLayoutData(mainCompositeLData);
		mainComposite.setLayout(mainCompositeLayout);
		GridData frameTreeViewerLData = new GridData();
		frameTreeViewerLData.grabExcessVerticalSpace = true;
		frameTreeViewerLData.grabExcessHorizontalSpace = true;
		frameTreeViewerLData.verticalAlignment = GridData.FILL;
		frameTreeViewerLData.horizontalAlignment = GridData.FILL;
		frameTreeViewer = new TreeViewer(mainComposite, SWT.BORDER);
		tree = frameTreeViewer.getTree();
		tree.setHeaderVisible(true);
		
		frameTreeViewer.getControl().setLayoutData(frameTreeViewerLData);
		frameTreeViewer.setContentProvider(new ContainerContentProvider());
		frameTreeViewer.setLabelProvider(new ContainerLabelProvider());
		
		Container treeRoot = new Container("GUI root container", "Mock GUI Container for root", "GUI Container used to put the real data into.  This allows us to \"see\" the Root frame");
		treeRoot.addContainer(frame);
		frameTreeViewer.setInput(treeRoot);
		frameTreeViewer.expandAll();

		initializeToolBar();

		// Set the provider service name in the status bar
		getViewSite().getActionBars().getStatusLineManager().setMessage("Frames provided by the " + frameProvider.getFrameProviderName() + " adapter");
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	private void initializeToolBar() {
		IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
	}

}
