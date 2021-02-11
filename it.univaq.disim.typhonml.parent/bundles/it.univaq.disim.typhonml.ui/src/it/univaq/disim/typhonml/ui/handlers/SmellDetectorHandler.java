package it.univaq.disim.typhonml.ui.handlers;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import it.univaq.disim.typhon.acceleo.services.Services;
import it.univaq.disim.typhonml.mapper_generator.epsilon.EVLStandalone;
import typhonml.Model;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SmellDetectorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		List<String> returnValues = new ArrayList<String>();

		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
        Object object = selection.getFirstElement();
        if (object instanceof IFile) {
        	IFile f = (IFile) object;
//        	Model model = Services.loadXtextModel(f.getFullPath().toString());
        	
//        	Services.serialize(model, f.getFullPath().toString().replace(".tml", ".xmi"));
        	
        	EVLStandalone evlStandalone  = new EVLStandalone();
        	try {
        		returnValues = evlStandalone.execute(f.getLocation().toFile().toString(), "/Users/francesco/Sviluppo/Workspaces/TYPHON/workspace_typhonml_last/typhonml/it.univaq.disim.typhonml.parent/bundles/it.univaq.disim.typhonml.mapping_generation/model/RequirementsDefinition.xmi");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	
        	for(IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()){
        	    try {
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        
        
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		String stringResult = "";
        //Create string to visualize
        if(returnValues.size() > 0) {
        	for (String string : returnValues) {
        		stringResult += string + "\r\n";
			}
        	
//        	MessageDialog.open(1, window.getShell(), "TyphonML Model Validation", stringResult, SWT.RESIZE);
        	
        	MessageDialog.openWarning(window.getShell(),"TyphonML Model Validation", stringResult);
        }else {
        	stringResult = "TyphonML model has been validated!";
        	
    		MessageDialog.openInformation(window.getShell(), "TyphonML Model Validation", stringResult);
        	
        }

		return null;
	}
}
