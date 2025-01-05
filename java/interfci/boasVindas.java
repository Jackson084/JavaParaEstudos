package interfci;

import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
        t.requestDefaultFocus();
        f.add(t);
        t.setVisible(true);
        
        JTextField t2 = new JTextField();
        t2.setBounds(100, 200, 150, 30);
        t2.setFont(new Font( "arial", Font.CENTER_BASELINE, 10));
        t2.requestDefaultFocus();
        f.add(t2);
        t2.setVisible(true);

        JLabel l = new JLabel("numero 1: ");
        l.setBounds(5, 100, 100, 20);
        l.setFont(new Font( "arial", Font.PLAIN, 10));
        f.add(l);
        
  
        JLabel l2 = new JLabel("numero 2: ");
        l2.setBounds(5, 200, 100, 20);
        l2.setFont(new Font( "arial", Font.PLAIN, 10));
        f.add(l2);

        JButton b = new JButton(" clique pra somar");
        b.setBounds(100, 150, 150, 30);
        b.setFont(new Font( "arial", Font.CENTER_BASELINE, 10));
        b.requestDefaultFocus();
        b.setVisible(true);
        b.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mensagem que será exibida ao clicar no botão
                Integer n1= Integer.parseInt(t.getText());
                Integer n2= Integer.parseInt(t2.getText());
                int soma= n1+n2;

                JOptionPane.showMessageDialog(null, "a soma dos Numeros é: "+soma, " titulo da mensagem",
                JOptionPane.INFORMATION_MESSAGE);
            }
        });
    f.add(b);
    


    }
    
}
