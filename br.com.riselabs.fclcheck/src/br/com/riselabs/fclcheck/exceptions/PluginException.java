package br.com.riselabs.fclcheck.exceptions;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import br.com.riselabs.fclcheck.FCLCheck;

public class PluginException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PluginException(final String message) {
		super(message);
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				Shell shell;
//				if (CoreController.getWindow() != null) {
//					shell = CoreController.getWindow().getShell();
//				} else {
					shell = new Shell();
//				}
				MessageDialog.openError(shell, FCLCheck.PLUGIN_NAME,
						message);
			}
		});
	}

}
