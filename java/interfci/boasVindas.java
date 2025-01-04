package interfci;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class boasVindas {
    public static void main(String[] args) {
        JFrame f= new JFrame(" seja bem vindo");
        f.setVisible(true); 
        f.setSize(500, 500);  
        //f.setLayout(new GridLayout(5, 2, 10, 10)); // Layout em grade
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE); 
        f.setResizable(false); 
        f.setLocationRelativeTo(null); 
        f.setLayout(null);
        
        JTextField t = new JTextField();
        t.setBounds(100, 100, 150, 30);
        t.setFont(new Font( "arial", Font.CENTER_BASELINE, 10));
        t.setVisible(true);
        f.add(t);
        t.requestDefaultFocus();

        JTextField t2 = new JTextField();
        t2.setBounds(100, 200, 150, 30);
        t2.setFont(new Font( "arial", Font.CENTER_BASELINE, 10));
        t2.setVisible(true);
        f.add(t2);
        t2.requestDefaultFocus();

        JLabel l = new JLabel("numero 1: ");
        l.setBounds(5, 200, 20, 20);
        l.setFont(new Font( "arial", Font.PLAIN, 10));
        f.add(l);
        
  
        JLabel l2 = new JLabel("numero 1: ");
        l2.setBounds(5, 100, 20, 20);
        l2.setFont(new Font( "arial", Font.PLAIN, 10));
        f.add(l2);
    


    }
    
}
