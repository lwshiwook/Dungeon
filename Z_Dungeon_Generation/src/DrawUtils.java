import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class DrawUtils {
	private BufferedImage image;

	private Graphics2D graphics;

	public static void paint() {

	}

	public void init() {
		int width = 720, hight = 720;
		image = new BufferedImage(width, hight, BufferedImage.TYPE_INT_RGB);
		graphics = (Graphics2D) image.getGraphics();
	}

}
