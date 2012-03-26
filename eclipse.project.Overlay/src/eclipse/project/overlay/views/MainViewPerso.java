package eclipse.project.overlay.views;

import javax.swing.*;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class MainViewPerso extends ViewPart{

	public MainViewPerso(){
		
	}
	
	@Override
	public void createPartControl(final Composite parent) {
		// TODO Auto-generated method stub
		
		Shell shell = parent.getShell();
		
		GridLayout myGridLayout = new GridLayout(2,false);
		parent.setLayout(myGridLayout);
		
		Label videoSourceLabel = new Label(parent, SWT.NONE);
		videoSourceLabel.setText("Source vidéo : ");
		
//		final Text videoSourceValue = new Text(parent, SWT.BORDER);
//		GridData myGridData = new GridData(GridData.FILL_HORIZONTAL);
//		videoSourceValue.setLayoutData(myGridData);
		
		final Combo videoSourceValue = new Combo(parent, SWT.NONE);
		videoSourceValue.add("Fichier");
		videoSourceValue.add("Webcam");
		videoSourceValue.add("URL");
		GridData myGridData = new GridData(GridData.FILL_HORIZONTAL);
		videoSourceValue.setLayoutData(myGridData);
		
		
		Label companyNameLabel = new Label(parent, SWT.NONE);
		companyNameLabel.setText("Société : ");
		
		final Text companyNameValue = new Text(parent, SWT.BORDER);
		myGridData = new GridData(GridData.FILL_HORIZONTAL);
		companyNameValue.setLayoutData(myGridData);
		
		JButton newAttendee = new JButton();
		newAttendee.setText("Ajouter");		
		newAttendee.addSelectionListener(new SelectionListener() {			
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageDialog.openInformation(
						parent.getShell(),
						"Vue principale",
						"cliquage de bouton");
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {		
			}
		});
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

}
