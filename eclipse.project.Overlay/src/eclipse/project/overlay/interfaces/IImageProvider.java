package eclipse.project.overlay.interfaces;

import java.awt.Image;

public interface IImageProvider {
	public Image getImage(String urlVid, String urlImg, int tpsCapture);
}
