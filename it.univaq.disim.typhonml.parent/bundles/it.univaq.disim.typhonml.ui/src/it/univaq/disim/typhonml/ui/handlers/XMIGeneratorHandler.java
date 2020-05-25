package it.univaq.disim.typhonml.ui.handlers;


import java.io.File;

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
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import it.univaq.disim.typhonml.acceleo.runner.Runner;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class XMIGeneratorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
        Object object = selection.getFirstElement();
        if (object instanceof IFile) {
        	IFile f = (IFile) object;
   			File folder = new File(f.getLocation().toOSString().replace("." + f.getFileExtension(), "") + File.separator + "gen-src");
   			//Services.generateFromXMI(f.getFullPath().toString(), folder.getAbsolutePath());
        	for(IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()){
        	    try {
        	    	Runner r = new Runner();
       				r.run(f.getFullPath().toString(), folder.toString());
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Ui",
				"Microservice architecture was generated");
		return null;
		
	}
}
