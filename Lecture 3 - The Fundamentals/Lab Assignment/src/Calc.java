import java.awt.event.*;
import javax.swing.*;
import java.awt.*; 

public class Calc {
    static JFrame AppFrame;
    static JTextField TextField;

    String[] statement;

    Calc() 
    { 
        for (int i = 0, len = statement.length; i<len;i++){
            statement[i] = statement[i++] = " ";
        }
    }
    public static void main(String[] args){

        AppFrame = new JFrame("Java Calculator"); 
  
        try { 
            // set look and feel 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 
  
        // create a textfield 
        TextField = new JTextField(16);

        Calc c = new Calc();
        
        // create number buttons and some operators 
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1; 
  
        // create number buttons 
        b0 = new JButton("0"); 
        b1 = new JButton("1"); 
        b2 = new JButton("2"); 
        b3 = new JButton("3"); 
        b4 = new JButton("4"); 
        b5 = new JButton("5"); 
        b6 = new JButton("6"); 
        b7 = new JButton("7"); 
        b8 = new JButton("8"); 
        b9 = new JButton("9"); 
          
        // equals button 
        beq1 = new JButton("="); 
          
        // create operator buttons 
        ba = new JButton("+"); 
        bs = new JButton("-"); 
        bd = new JButton("/"); 
        bm = new JButton("*"); 
        beq = new JButton("C"); 

        // create . button 
        be = new JButton("."); 
  
        // create a panel 
        JPanel p = new JPanel(); 
  
        // add action listeners 
        bm.addActionListener(c); 
        bd.addActionListener(c); 
        bs.addActionListener(c); 
        ba.addActionListener(c); 
        b9.addActionListener(c); 
        b8.addActionListener(c); 
        b7.addActionListener(c); 
        b6.addActionListener(c); 
        b5.addActionListener(c); 
        b4.addActionListener(c); 
        b3.addActionListener(c); 
        b2.addActionListener(c); 
        b1.addActionListener(c); 
        b0.addActionListener(c); 
        be.addActionListener(c); 
        beq.addActionListener(c); 
        beq1.addActionListener(c);
    }
}