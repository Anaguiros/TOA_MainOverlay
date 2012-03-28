package eclipse.project.overlay.views;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.part.*;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;

import eclipse.project.overlay.Activator;
import eclipse.project.overlay.interfaces.IImageProvider;


public class ImageView extends ViewPart {

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		final Shell shell = parent.getShell();
		
		FillLayout myFillLayout = new FillLayout(SWT.VERTICAL);
		parent.setLayout(myFillLayout);
		
		Image image = null;
		
		image = Activator.getDefault().getImage(image);
		
		Label imageLabel = new Label(parent, SWT.NONE);
		imageLabel.setImage(image);
		
//		private static Image makeSWTImage(Display display, java.awt.Image ai)
//		throws Exception
//		{
//		int width = ai.getWidth(null);
//		int height = ai.getHeight(null);
//		BufferedImage bufferedImage =
//		new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//		Graphics2D g2d = bufferedImage.createGraphics();
//		g2d.drawImage(ai, 0, 0, null);
//		g2d.dispose();
//		int[] data =
//		((DataBufferInt)bufferedImage.getData().getDataBuffer())
//		.getData();
//		ImageData imageData =
//		new ImageData(width, height, 24,
//		new PaletteData(0xFF0000, 0x00FF00, 0x0000FF));
//		imageData.setPixels(0, 0, data.length, data, 0);
//		Image swtImage = new Image(display, imageData);
//		return swtImage;
//		} 
		
		//ImageDescriptor myImagedescriptor = ImageDescriptor.createFromImage(img);
		//IImageProvider imageProvider;
		
		//Image myImage = new Image(display, "btn1.bmp");
	}


	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

	
}