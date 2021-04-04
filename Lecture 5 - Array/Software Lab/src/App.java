import javax.swing.JFrame;
import java.awt.BorderLayout;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
		DrawPanel dp = new DrawPanel(); 
		
		frame.add(dp, BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(900, 700);
		
		frame.setVisible(true);
    }
}
