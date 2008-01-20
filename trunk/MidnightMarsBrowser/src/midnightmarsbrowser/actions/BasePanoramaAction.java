package midnightmarsbrowser.actions;

import midnightmarsbrowser.editors.MMBEditorBase;
import midnightmarsbrowser.editors.ViewerEditor;

import org.eclipse.ui.IWorkbenchWindow;

public abstract class BasePanoramaAction extends BaseViewerAction {

	public BasePanoramaAction(IWorkbenchWindow window) {
		super(window);
	}
	
	public BasePanoramaAction(IWorkbenchWindow window, int style) {
		super(window, style);
	}	

	public boolean isMyEditor(MMBEditorBase newEditor) {
		return ((newEditor != null) && (newEditor instanceof ViewerEditor) && (((ViewerEditor)newEditor).getPanoramaCanvas() != null));
	}	
}
