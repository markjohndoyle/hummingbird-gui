package com.logica.hummingbird.framebrokerviewer.views;
import com.cloudgarden.resource.SWTResourceManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.CoolItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.part.ViewPart;

import com.logica.hummingbird.cameltmframeprovider.CamelTmFrameProvider;
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
	private CoolBar coolBar;
	private TreeViewer frameTreeViewer;
	
	IFrameProvider frameProvider;
	private ToolItem frameProviderButton;
	private ToolBar toolBar1;
	private CoolItem frameProviderDetails;

	public FrameView() {
		frameProvider = new CamelTmFrameProvider();
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
		//END <<  frameTreeViewer
		//END <<  mainComposite
		//START >>  coolBar
		GridData coolBarLData = new GridData();
		coolBarLData.grabExcessHorizontalSpace = true;
		coolBarLData.horizontalAlignment = GridData.FILL;
		coolBarLData.verticalAlignment = GridData.END;
		coolBar = new CoolBar(parent, SWT.NULL);
		coolBar.setLayoutData(coolBarLData);
		
		//START >>  frameProviderDetails
		frameProviderDetails = new CoolItem(coolBar, SWT.NONE);
		frameProviderDetails.setSize(60, 30);
		//START >>  toolBar1
		toolBar1 = new ToolBar(coolBar, SWT.NONE);
		frameProviderDetails.setControl(toolBar1);
		//START >>  frameProviderButton
		frameProviderButton = new ToolItem(toolBar1, SWT.NONE);
		frameProviderButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				System.out.println("frameProviderButton.widgetSelected, event="+evt);
				//TODO add your code for frameProviderButton.widgetSelected
			}
		});
		frameProviderButton.setText(frameProvider.getFrameProviderName());
		//END <<  frameProviderButton
		//END <<  toolBar1
		//END <<  frameProviderDetails
		//END <<  coolBar
		// TODO Auto-generated method stubs
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
