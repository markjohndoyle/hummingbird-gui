package com.logica.hummingbird.simulatorplugin.packetdesigner.editors;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.MarqueeToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.DeleteAction;
import org.eclipse.gef.ui.actions.EditorPartAction;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.RedoAction;
import org.eclipse.gef.ui.actions.SaveAction;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.gef.ui.actions.StackAction;
import org.eclipse.gef.ui.actions.UndoAction;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

import com.logica.hummingbird.simulatorplugin.SimulatorPlugin;
import com.logica.hummingbird.simulatorplugin.packetdesigner.editparts.PacketDesignerEditPartFactory;
import com.logica.hummingbird.simulatorplugin.packetdesigner.editparts.ParameterCreationFactory;
import com.logica.hummingbird.simulatorplugin.packetdesigner.menus.PacketDesignerContextMenu;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.PacketDesign;
import com.logica.hummingbird.telemetry.HummingbirdParameter;

/**
 * 
 * @author Mark
 * 
 */
// public class PacketDesignerEditor extends EditorPart {
public class PacketDesignerEditor extends GraphicalEditorWithFlyoutPalette {
	public final static String ID = "com.logica.hummingbird.simulatorplugin.editors.PacketDesignerEditor";

	/** the <code>EditDomain</code>, will be initialised lazily */
	// private EditDomain editDomain;

	/** has the model been changed after the last save */
	private boolean isDirty;

	/** Packet Designer graphical viewer */
	// private GraphicalViewer graphicalViewer;

	/** the palette root */
	private PaletteRoot paletteRoot;

	/** the palette viewer */
	// private PaletteViewer paletteViewer;

	/** the editor's action registry */
	private ActionRegistry actionRegistry;

	/** the list of action ids that are to EditPart actions */
	private List<String> editPartActionIDs = new ArrayList<String>();

	/** the list of action ids that are to CommandStack actions */
	private List<String> stackActionIDs = new ArrayList<String>();

	/** the list of action ids that are editor actions */
	private List<String> editorActionIDs = new ArrayList<String>();

	/** the undo-able <code>IPropertySheetPage</code> */
	private PropertySheetPage undoablePropertySheetPage;

	/** the overview outline page */
	// private OverviewOutlinePage overviewOutlinePage;

	// HummingbirdPacket packet;
	private PacketDesign packetDesign;

	private KeyHandler sharedKeyHandler;

	public PacketDesignerEditor() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#setInput(org.eclipse.ui.IEditorInput)
	 */
	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Implement save method

		// update CommandStack
		getCommandStack().markSaveLocation();

	}

	@Override
	public void doSaveAs() {
		// TODO Implement save method

		// update CommandStack
		getCommandStack().markSaveLocation();
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		// store site and input
		setSite(site);
		setInput(input);
		setEditDomain(new DefaultEditDomain(this));

		// packet = ((PacketDesignEditorInput) input).getPacketDesign().getPacket();
		packetDesign = ((PacketDesignEditorInput) input).getPacketDesign();
		setPartName(packetDesign.getPacket().getName());

		// add CommandStackListener
		// getCommandStack().addCommandStackListener(getCommandStackListener());

		// add selection change listener
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(getSelectionListener());

		// create all the actions
		createActions();
	}

	@Override
	protected void createActions() {
		super.createActions();
		addStackAction(new UndoAction(this));
		addStackAction(new RedoAction(this));

		DeleteAction deleteAction = new DeleteAction((IWorkbenchPart) this);
		addEditPartAction(deleteAction);

		addEditorAction(new SaveAction(this));
		// addEditorAction(new PrintAction(this));
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	// @Override
	// public void createPartControl(Composite parent) {
	// super.createPartControl(parent);
	// SashForm sashForm = new SashForm(parent, SWT.HORIZONTAL);
	// sashForm.setBackground(parent.getBackground());
	// paletteViewer = createPaletteViewer(sashForm);
	// graphicalViewer = createGraphicalViewer(sashForm);
	// sashForm.setWeights(new int[] { 30, 70 });
	// }

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	/**
	 * Returns the <code>EditDomain</code> used by this editor.
	 * 
	 * @return the <code>EditDomain</code> used by this editor
	 */
	// public EditDomain getEditDomain() {
	// if (editDomain == null) {
	// editDomain = new DefaultEditDomain(this);
	// }
	// return editDomain;
	// }

	/**
	 * Indicates if the editor has unsaved changes.
	 * 
	 * @see EditorPart#isDirty
	 */
	@Override
	public boolean isDirty() {
		return isDirty;
	}

	/**
	 * Sets the dirty state of this editor.
	 * 
	 * <p>
	 * An event will be fired immediately if the new state is different than the current one.
	 * 
	 * @param dirty
	 *            the new dirty state to set
	 */
	protected void setDirty(boolean dirty) {
		if (isDirty != dirty) {
			isDirty = dirty;
			firePropertyChange(IEditorPart.PROP_DIRTY);
		}
	}

	/**
	 * Returns the <code>CommandStack</code> of this editor's <code>EditDomain</code>.
	 * 
	 * @return the <code>CommandStack</code>
	 */
	// public CommandStack getCommandStack() {
	// return getEditDomain().getCommandStack();
	// }

	/**
	 * Returns the <code>CommandStackListener</code>.
	 * 
	 * @return the <code>CommandStackListener</code>
	 */
	// protected CommandStackListener getCommandStackListener() {
	// return commandStackListener;
	// }

	/**
	 * The <code>CommandStackListener</code> that listens for <code>CommandStack </code>changes.
	 */
	private CommandStackListener commandStackListener = new CommandStackListener() {
		@Override
		public void commandStackChanged(EventObject event) {
			updateActions(stackActionIDs);
			setDirty(getCommandStack().isDirty());
		}
	};

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		// remove CommandStackListener
		// getCommandStack().removeCommandStackListener(getCommandStackListener());

		// dispose the ActionRegistry (will dispose all actions)
		getActionRegistry().dispose();

		// dispose SelectionListener
		getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(getSelectionListener());

		// important: always call super implementation of dispose
		super.dispose();
	}

	/**
	 * Creates a new <code>GraphicalViewer</code>, configures, registers and initialises it. *
	 * 
	 * @param parent
	 *            the parent composite
	 * @return a new <code>GraphicalViewer</code>
	 */
	// private GraphicalViewer createGraphicalViewer(Composite parent) {
	@Override
	protected void configureGraphicalViewer() {
		// configure the viewer
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setRootEditPart(new ScalableFreeformRootEditPart());
		viewer.setKeyHandler(new GraphicalViewerKeyHandler(viewer));
		viewer.setContextMenu(new PacketDesignerContextMenu(viewer, getActionRegistry()));
		viewer.setKeyHandler(new GraphicalViewerKeyHandler(viewer).setParent(getCommonKeyHandler()));

		// hook the viewer into the EditDomain
		getEditDomain().addViewer(viewer);

		// activate the viewer as selection provider for Eclipse
		getSite().setSelectionProvider(viewer);

		// return viewer;
	}

	/**
	 * Returns a lazily instantiated KeyHandler which specifies which {@link IAction} to call on press.
	 * 
	 * @return
	 */
	protected KeyHandler getCommonKeyHandler() {
		if (sharedKeyHandler == null) {
			sharedKeyHandler = new KeyHandler();
			sharedKeyHandler.put(KeyStroke.getPressed(SWT.DEL, 127, 0), getActionRegistry().getAction(ActionFactory.DELETE.getId()));
			sharedKeyHandler.put(KeyStroke.getPressed(SWT.F2, 0), getActionRegistry().getAction(GEFActionConstants.DIRECT_EDIT));
		}
		return sharedKeyHandler;
	}

	/**
	 * Returns the content of this editor
	 * 
	 * @return the model object
	 */
	protected Object getContent() {
		return packetDesign;
	}

	/**
	 * Returns the casted <code>EditPartFactory</code> that the <code>GraphicalViewer</code> will use.
	 * 
	 * @return the <code>EditPartFactory</code>
	 */
	protected EditPartFactory getEditPartFactory() {
		return new PacketDesignerEditPartFactory();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#getAdapter(java.lang.Class)
	 */
	@Override
	public Object getAdapter(Class adapter) {
		// we need to handle common GEF elements we created
		if (adapter == GraphicalViewer.class || adapter == EditPartViewer.class) {
			return getGraphicalViewer();
		}
		else if (adapter == CommandStack.class) {
			return getCommandStack();
		}
		else if (adapter == EditDomain.class) {
			return getEditDomain();
		}
		else if (adapter == ActionRegistry.class) {
			return getActionRegistry();
		}
		else if (adapter == IPropertySheetPage.class) {
			return getPropertySheetPage();
		}
		// the super implementation handles the rest
		return super.getAdapter(adapter);
	}

	/**
	 * Creates a new <code>PaletteViewer</code>, configures, registers and initialises it.
	 * 
	 * @param parent
	 *            the parent composite
	 * @return a new <code>PaletteViewer</code>
	 */
	// private PaletteViewer createPaletteViewer(Composite parent) {
	// // create graphical viewer
	// PaletteViewer viewer = new PaletteViewer();
	// viewer.createControl(parent);
	//
	// // hook the viewer into the EditDomain (only one palette per EditDomain)
	// getEditDomain().setPaletteViewer(viewer);
	//
	// // important: the palette is initialised via EditDomain
	// getEditDomain().setPaletteRoot(getPaletteRoot());
	//
	// return viewer;
	// }

	/**
	 * Returns the <code>PaletteRoot</code> this editor's palette uses.
	 * 
	 * @return the <code>PaletteRoot</code>
	 */
	protected PaletteRoot getPaletteRoot() {
		// TODO Set this up for the packet designer
		if (null == paletteRoot) {
			// create root
			paletteRoot = new PaletteRoot();

			// a group of default control tools
			PaletteGroup controls = new PaletteGroup("Controls");
			paletteRoot.add(controls);

			// the selection tool
			ToolEntry tool = new SelectionToolEntry();
			controls.add(tool);

			// use selection tool as default entry
			paletteRoot.setDefaultEntry(tool);

			// the marquee selection tool
			controls.add(new MarqueeToolEntry());

			// a separator
			PaletteSeparator separator = new PaletteSeparator(SimulatorPlugin.PLUGIN_ID + ".palette.seperator");
			separator.setUserModificationPermission(PaletteEntry.PERMISSION_NO_MODIFICATION);
			controls.add(separator);

			// a tool for creating connection
			PaletteDrawer packetDesignGroup = new PaletteDrawer("Packet design");
			paletteRoot.add(packetDesignGroup);

			// TODO add Packet Design palette drawers and entries here
			CombinedTemplateCreationEntry parameterCreationToolEntry;
			parameterCreationToolEntry = new CombinedTemplateCreationEntry("Parameter", "Create parameters", new ParameterCreationFactory(
					HummingbirdParameter.class), null, null);
			packetDesignGroup.add(parameterCreationToolEntry);
		}
		return paletteRoot;
	}

	/**
	 * Returns the <code>PaletteViewer</code> of this editor.
	 * 
	 * @return the <code>PaletteViewer</code>
	 */
	// public PaletteViewer getPaletteViewer() {
	// return paletteViewer;
	// }

	/**
	 * Returns the action registry of this editor.
	 * 
	 * @return the action registry
	 */
	public ActionRegistry getActionRegistry() {
		if (actionRegistry == null) {
			actionRegistry = new ActionRegistry();
		}
		return actionRegistry;
	}

	/**
	 * Adds an <code>EditPart</code> action to this editor.
	 * 
	 * <p>
	 * <code>EditPart</code> actions are actions that depend and work on the selected <code>EditPart</code>s.
	 * 
	 * @param action
	 *            the <code>EditPart</code> action
	 */
	protected void addEditPartAction(SelectionAction action) {
		getActionRegistry().registerAction(action);
		editPartActionIDs.add(action.getId());
	}

	/**
	 * Adds an <code>CommandStack</code> action to this editor.
	 * 
	 * <p>
	 * <code>CommandStack</code> actions are actions that depend and work on the <code>CommandStack</code>.
	 * 
	 * @param action
	 *            the <code>CommandStack</code> action
	 */
	protected void addStackAction(StackAction action) {
		getActionRegistry().registerAction(action);
		stackActionIDs.add(action.getId());
	}

	/**
	 * Adds an editor action to this editor.
	 * 
	 * <p>
	 * <Editor actions are actions that depend and work on the editor.
	 * 
	 * @param action
	 *            the editor action
	 */
	protected void addEditorAction(EditorPartAction action) {
		getActionRegistry().registerAction(action);
		editorActionIDs.add(action.getId());
	}

	/**
	 * Adds an action to this editor's <code>ActionRegistry</code>. (This is a helper method.)
	 * 
	 * @param action
	 *            the action to add.
	 */
	protected void addAction(IAction action) {
		getActionRegistry().registerAction(action);
	}

	/** the selection listener */
	private ISelectionListener selectionListener = new ISelectionListener() {
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			updateActions(editPartActionIDs);
		}
	};

	/**
	 * Returns the selection listener.
	 * 
	 * @return the <code>ISelectionListener</code>
	 */
	protected ISelectionListener getSelectionListener() {
		return selectionListener;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#firePropertyChange(int)
	 */
	@Override
	protected void firePropertyChange(int propertyId) {
		super.firePropertyChange(propertyId);
		updateActions(editorActionIDs);
	}

	/**
	 * Returns the undoable <code>PropertySheetPage</code> for this editor.
	 * 
	 * @return the undoable <code>PropertySheetPage</code>
	 */
	protected PropertySheetPage getPropertySheetPage() {
		if (null == undoablePropertySheetPage) {
			undoablePropertySheetPage = new PropertySheetPage();
			undoablePropertySheetPage.setRootEntry(new UndoablePropertySheetEntry(getCommandStack()));
		}
		return undoablePropertySheetPage;
	}

	/**
	 * Returns the overview for the outline view.
	 * 
	 * @return the overview
	 */
	// protected OverviewOutlinePage getOverviewOutlinePage() {
	// if (null == overviewOutlinePage && null != getGraphicalViewer()) {
	// RootEditPart rootEditPart = getGraphicalViewer().getRootEditPart();
	// if (rootEditPart instanceof ScalableFreeformRootEditPart) {
	// overviewOutlinePage = new OverviewOutlinePage((ScalableFreeformRootEditPart) rootEditPart);
	// }
	// }
	// return overviewOutlinePage;
	// }

	@Override
	protected void initializeGraphicalViewer() {
		// configure the viewer
		GraphicalViewer viewer = getGraphicalViewer();

		// initialise the viewer with input
		viewer.setEditPartFactory(getEditPartFactory());
		viewer.setContents(getContent());

	}

	public void deleteSelection() {
		getActionRegistry().getAction(ActionFactory.DELETE.getId()).run();
	}

}
