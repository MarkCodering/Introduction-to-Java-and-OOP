import javax.swing.*;
class gui{
    public static void main(String args[]){
       JFrame frame = new JFrame("Welcome to the student learning system");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1000,1000);
       JButton button = new JButton("Login");
       frame.getContentPane().add(button); // Adds Button to content pane of frame
       frame.setVisible(true);

       
    }
}