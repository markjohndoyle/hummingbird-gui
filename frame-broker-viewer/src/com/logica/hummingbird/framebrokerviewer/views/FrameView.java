package com.logica.hummingbird.framebrokerviewer.views;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.logica.hummingbird.framebrokerviewer.Activator;
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
	private Composite mainComposite;
	private TreeViewer frameTreeViewer;
	
	IFrameProvider frameProvider;

	public FrameView() {
		System.out.println("Getting Frame provider service");
		frameProvider = (IFrameProvider) Activator.getFrameProviderServices().getService();
		
		System.out.println("Frame view instantiation: frameProviderServices tracking count = " + Activator.getFrameProviderServices().getTrackingCount());

		System.out.println(frameProvider.getFrameProviderName());
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
		frameTreeViewer = new TreeViewer(mainComposite, SWT.NONE);
		frameTreeViewer.getControl().setLayoutData(frameTreeViewerLData);

		initializeToolBar();

		
		
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
