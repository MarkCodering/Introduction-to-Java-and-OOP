// Java program to demonstrate read and write of image 
import java.io.File; 
import java.io.IOException; 
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO; 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.util.Scanner;
import java.awt.*;

public class ReadImage
{ 
	public static void processor(String args[])throws IOException 
	{ 
		int width = 0; //width of the image 
		int height = 0; //height of the image
        String text;
		int centerX;
		int centerY;

        Scanner scan = new Scanner(System.in);
		Scanner reader = new Scanner(System.in);

        System.out.println("Please input your width: ");
        width = scan.nextInt();
        System.out.println("Please input your height: ");
        height = scan.nextInt();
        System.out.println("Please input your watermark: ");
        text = reader.nextLine();
		System.out.println("Please input your watermark's position (X): ");
		centerX = scan.nextInt();
		System.out.println("Please input your watermark's position (Y): ");
		centerY = scan.nextInt();

		scan.close();
		reader.close();
		// For storing image in RAM 
		BufferedImage image = null; 

		// READ IMAGE 
		try
		{ 
			File input_file = new File("C:/Users/admin/Downloads/image_1.jpg"); //image file path 
			/* create an object of BufferedImage type and pass 
			as parameter the width, height and image int 
			type.TYPE_INT_ARGB means that we are representing 
			the Alpha, Red, Green and Blue component of the 
			image pixel using 8 bit integer value. */
			image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB); 

			// Reading input file 
			image = ImageIO.read(input_file); 

			System.out.println("Reading complete."); 
		} 
		catch(IOException e) 
		{ 
			System.out.println("Error: "+e); 
		} 

		// WRITE IMAGE 
		try
		{ 
			// Output file path 
			File output_file = new File("C:/Users/admin/Downloads/image_1.jpg"); 

			// Writing to file taking type and path as 
			ImageIO.write(image, "jpg", output_file); 

			System.out.println("Writing complete."); 
		} 
		catch(IOException e) 
		{ 
			System.out.println("Error: "+e); 
		} 
        
        //Process: Transparency
        BufferedImage tmpImg = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = (Graphics2D) tmpImg.getGraphics();
        g2d.setComposite(AlphaComposite.SrcOver.derive(0.5f)); 
        // set the transparency level in range 0.0f - 1.0f 
        g2d.drawImage(image, 0, 0, null);
        image = tmpImg;

        //Process: Watermark
		Graphics2D g2 = (Graphics2D) image.getGraphics();
	 
		// initializes necessary graphic properties
		AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.1f);
		g2.setComposite(alphaChannel);
		g2.setColor(Color.BLUE);
		g2.setFont(new Font("Arial", Font.BOLD, 64));
	 
		// paints the textual watermark
		g2.drawString(text, centerX, centerY);

		g2.dispose();
	 
		System.out.println("The watermark is added to the image.");

        //Show image
        ImageIcon icon = new ImageIcon(image);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(width, height);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//main() ends here 
}//class ends here 