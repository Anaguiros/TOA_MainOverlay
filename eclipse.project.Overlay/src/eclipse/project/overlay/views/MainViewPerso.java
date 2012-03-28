package eclipse.project.overlay.views;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
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
		
		final Shell shell = parent.getShell();
		
		FillLayout myFillLayout = new FillLayout(SWT.VERTICAL);
		parent.setLayout(myFillLayout);
		
		
		
		Group groupVideo = new Group(parent, SWT.NONE);
		groupVideo.setLayout (new GridLayout(2, false) );
		groupVideo.setText ("Capture Vidéo");
				
		Label videoSourceLabel = new Label(groupVideo, SWT.NONE);
		videoSourceLabel.setText("Source vidéo : ");
		
		final Combo videoSourceValue = new Combo(groupVideo, SWT.READ_ONLY);
		videoSourceValue.add("Fichier");
		videoSourceValue.add("Webcam");
		videoSourceValue.add("URL");
		GridData myGridData = new GridData(GridData.FILL_HORIZONTAL);
		//videoSourceValue.setLayoutData(myGridData);
	    
	    final Text sourceName = new Text(groupVideo, SWT.BORDER);
	    sourceName.setLayoutData(myGridData);
		
	    Button open = new Button(groupVideo, SWT.PUSH);
	    open.setText("Open...");
	    open.addSelectionListener(new SelectionAdapter() {
	    	public void widgetSelected(SelectionEvent event) {
	    		// User has selected to open a single file
	    		FileDialog dlg = new FileDialog(shell, SWT.OPEN);
	    		dlg.setFilterExtensions(new String[] { "*.avi", "*.mov", "*.*" });
//	    		dlg.setFilterNames(FILTER_NAMES);
//	    		dlg.setFilterExtensions(FILTER_EXTS);
	    		String fn = dlg.open();
	    		if (fn != null) {
					sourceName.setText(fn);
	    		}
	    	}
	    });
	    
	    Group groupTraitement = new Group(parent, SWT.NONE);
	    groupTraitement.setLayout (new GridLayout(2, false) );
	    groupTraitement.setText ("Traitement vidéo");
	    
	    Label videoTraitmentLabel = new Label(groupTraitement, SWT.NONE);
	    videoTraitmentLabel.setText("Traitement appliqué : ");
		
	    final Combo videoTraitmentValue = new Combo(groupTraitement, SWT.READ_ONLY);
	    videoTraitmentValue.add("Sépia");
	    videoTraitmentValue.add("Noir & Blanc");
		myGridData = new GridData(GridData.FILL_HORIZONTAL);
		videoTraitmentValue.setLayoutData(myGridData);
	    
		Group groupSocial = new Group(parent, SWT.NONE);
		groupSocial.setLayout (new GridLayout(2, false) );
		groupSocial.setText ("Réseau Social");
		
		Label networkTypeLabel = new Label(groupSocial, SWT.NONE);
		networkTypeLabel.setText("Réseau : ");
		
		final Combo networkTypeValue = new Combo(groupSocial, SWT.READ_ONLY);
		networkTypeValue.add("Facebook");
		networkTypeValue.add("Twitter");
		networkTypeValue.add("Blogger");
		myGridData = new GridData(GridData.FILL_HORIZONTAL);
		networkTypeValue.setLayoutData(myGridData);

		Group groupControl = new Group(parent, SWT.NONE);
		groupControl.setLayout (new GridLayout(2, false) );
		
		Button acceptButton = new Button(groupControl, SWT.PUSH);
		acceptButton.setText("Accept");
		
		Button cancelButton = new Button(groupControl, SWT.PUSH);
		cancelButton.setText("Cancel");
		
//		Button newAttendee = new Button(parent, SWT.BORDER);
//		newAttendee.setText("Ajouter");		
//		newAttendee.addSelectionListener(new SelectionListener() {			
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//				MessageDialog.openInformation(
//						parent.getShell(),
//						"Vue principale",
//						"cliquage de bouton");
//			}
//			
//			@Override
//			public void widgetDefaultSelected(SelectionEvent e) {		
//			}
//		});
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

}
