package imageHandling;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageHandlingDemo {

	public static void main(String[] args) throws IOException {
		
		int width = 963;
		int height = 640;
		
		
		BufferedImage image = null;
		
		image = readFromFile (width, height , image);
		
		//write to a new destination file
		writeToFile(image);

	}

	private static BufferedImage readFromFile(int width, int height , BufferedImage image) {
		
		try {
			//create a file object
			File sampleFile = new File("/Users/developer/Documents/Tanzania.png");
			
			//create object of buffer image
			image = new BufferedImage(width , height , BufferedImage.TYPE_INT_ARGB);
			
			//Reading input file
			image = ImageIO.read(sampleFile);
			
			System.out.println("Reading complete: " + image);
			
		}catch(IOException e) {
			System.out.println("Error: " + e);
		}
		
		return image; // return the image object
		
	}
	
	
private static  void writeToFile(BufferedImage image) {
		
		try {
			//destination location for an image
			File output = new File("/Users/developer/Documents/Magufuli.png");
			
			ImageIO.write(image,  "png", output); 
			
			System.out.println("writing complete");
			
		}catch(IOException e) {
			System.out.println("Error: " + e);
		}
		
	}
}
