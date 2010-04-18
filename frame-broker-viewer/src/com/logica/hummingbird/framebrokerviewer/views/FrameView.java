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
import com.logica.hummingbird.framebrokerviewer.Activator;
import com.logica.hummingbird.framebrokerviewer.views.ContainerLabelProvider;
import com.logica.hummingbird.tmframeprovider.IFrameProvider;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
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
		frameProvider = (IFrameProvider) Activator.getFrameProviderServices().getService();
		
		System.out.println("Frame view instantiation: frameProviderServices tracking count = " + Activator.getFrameProviderServices().getTrackingCount());

		System.out.println("Initialising test mock up data - REMOVE THIS!  FOR TESTING THE VIEW WITHOUT REAL DATA ONLY!");
		testDataInit();
		System.out.println(frameProvider.getFrameProviderName());
	}
	
	private void testDataInit() {
		frame = new Container("Test Frame", "Mock Test Frame", "Mock Frame create for testing");
		((Container)frame).addContainer(new Container("Test Frame Header", "Mock Test Frame Header", "Mock Frame Header create for testing"));
		Container framePacket = new Container("Test Frame Packet", "Mock Test Frame Packet", "Mock Frame Packet create for testing");
		((Container)frame).addContainer(framePacket);
		((Container)frame).addContainer(new Container("Test Frame Tail", "Mock Test Frame Tail", "Mock Frame Tail create for testing"));
		
		framePacket.addContainer(new Container("Test Packet Header", "Mock Test Packet Header", "Mock Packet Header create for testing"));
		framePacket.addContainer(new Container("Test Packet Body", "Mock Test Packet Body", "Mock Packet Body create for testing"));
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
		//START >>  frameTreeViewer
		GridData frameTreeViewerLData = new GridData();
		frameTreeViewerLData.grabExcessVerticalSpace = true;
		frameTreeViewerLData.grabExcessHorizontalSpace = true;
		frameTreeViewerLData.verticalAlignment = GridData.FILL;
		frameTreeViewerLData.horizontalAlignment = GridData.FILL;
		frameTreeViewer = new TreeViewer(mainComposite, SWT.BORDER);
		tree = frameTreeViewer.getTree();
		tree.setHeaderVisible(true);
		frameTreeViewer.setLabelProvider(new ContainerLabelProvider());
		frameTreeViewer.getControl().setLayoutData(frameTreeViewerLData);
		frameTreeViewer.setContentProvider(new ContainerContentProvider());
		
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
