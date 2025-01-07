package calc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class testCalc {
    public static void main(String[] args) {

        JFrame j= new JFrame();
        j.setSize(500, 500);
        j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
        j.setResizable(false); // impede ajuste da janela quando o programa foi execultado
        j.setLocationRelativeTo(null);
        j.setVisible(true);

       

        
        JTextField t = new JTextField();
        t.setBounds(50, 100, 100, 30);
        t.setFont(new Font("arial", Font.PLAIN, 10));
        //t.setSize(100, 30);
         Border border = BorderFactory.createLineBorder(Color.black, 2); // Cor azul e espessura 2
        t.setBorder(border);
        t.setVisible(true);
        j.add(t);
        t.requestFocus();

        JTextField t2 = new JTextField();
        t2.setBounds(225, 100, 100, 30);
        t2.setFont(new Font("arial", Font.PLAIN, 10));
        t2.setBorder(border);
        t2.setVisible(true);
        j.add(t2);
        t2.requestFocus();

        Calculadora c = new Calculadora();
        
        

        JButton b = new JButton("SOMAR");
        b.setBounds(50, 150, 100, 30);
        b.setFont(new Font( "arial", Font.CENTER_BASELINE, 5));
        b.setVisible(true);
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){ 
                Double m1 = Double.parseDouble(t.getText());
                Double m2 = Double.parseDouble(t2.getText());
                c.setN1(m1);
                c.setN2(m2);
                JOptionPane.showMessageDialog(null, "A soma é: "+c.soma(), "Soma",
                JOptionPane.INFORMATION_MESSAGE); 
                
               
            }
        });
        j.add(b);
        b.requestFocus();

        JButton b2 = new JButton("SUBTRAIR");
        b2.setBounds(50, 200, 100, 30);
        b2.setFont(new Font( "arial", Font.CENTER_BASELINE, 5));
        b2.setVisible(true);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){ 
                Double m1 = Double.parseDouble(t.getText());
                Double m2 = Double.parseDouble(t2.getText());
                c.setN1(m1);
                c.setN2(m2);
                JOptionPane.showMessageDialog(null, "A soma é: "+c.sub(), "Soma",
                JOptionPane.INFORMATION_MESSAGE); 
                
               
            }
        });
        j.add(b2);
        b2.requestFocus();

        JButton b3 = new JButton("MULTIPLICAR");
        b3.setBounds(50, 250, 100, 30);
        b3.setFont(new Font( "arial", Font.CENTER_BASELINE, 5));
        b3.setVisible(true);
        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){ 
                Double m1 = Double.parseDouble(t.getText());
                Double m2 = Double.parseDouble(t2.getText());
                c.setN1(m1);
                c.setN2(m2);
                JOptionPane.showMessageDialog(null, "A soma é: "+c.mult(), "Soma",
                JOptionPane.INFORMATION_MESSAGE); 
                
               
            }
        });
        j.add(b3);
        b3.requestFocus();

        JButton b4 = new JButton("DIVIDIR");
        b4.setBounds(50, 300, 100, 30);
        b4.setFont(new Font( "arial", Font.CENTER_BASELINE, 5));
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){ 
                Double m1 = Double.parseDouble(t.getText());
                Double m2 = Double.parseDouble(t2.getText());
                c.setN1(m1);
                c.setN2(m2);
                JOptionPane.showMessageDialog(null, "A soma é: "+c.divisao(), "Soma",
                JOptionPane.INFORMATION_MESSAGE); 
                
               
            }
        });
        b4.setVisible(true);
        j.add(b4);
        b4.requestFocus();
       
        
        
        

/* 
        b.addActionListener(new ActionListener(){
            Integer n1 = Integer.parseInt(b);
            c.setN1(n1);
        });
        j.add(b4);
        b4.requestFocus();/* */

    }
    
}
