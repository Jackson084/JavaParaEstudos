package interfci;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SomaGUI {
    public static void main(String[] args) {
        // Criando o JFrame (janela principal)
        JFrame frame = new JFrame("Calculadora de Soma");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2, 10, 10)); // Layout em grade

        // Criando os componentes
        JLabel label1 = new JLabel("Número 1 (Soma 1):");
        JTextField field1 = new JTextField();
        JLabel label2 = new JLabel("Número 2 (Soma 1):");
        JTextField field2 = new JTextField();

        JLabel label3 = new JLabel("Número 1 (Soma 2):");
        JTextField field3 = new JTextField();
        JLabel label4 = new JLabel("Número 2 (Soma 2):");
        JTextField field4 = new JTextField();

        JButton button = new JButton("Calcular Somas");
        JLabel resultLabel1 = new JLabel("Resultado da Soma 1: ");
        JLabel resultLabel2 = new JLabel("Resultado da Soma 2: ");

        // Adicionando os componentes à janela
        frame.add(label1);
        frame.add(field1);
        frame.add(label2);
        frame.add(field2);
        frame.add(label3);
        frame.add(field3);
        frame.add(label4);
        frame.add(field4);
        frame.add(button);
        frame.add(resultLabel1);
        frame.add(resultLabel2);

        // Adicionando ação ao botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Lendo os valores dos campos de texto
                    double num1 = Double.parseDouble(field1.getText());
                    double num2 = Double.parseDouble(field2.getText());
                    double num3 = Double.parseDouble(field3.getText());
                    double num4 = Double.parseDouble(field4.getText());

                    // Calculando as somas
                    double soma1 = num1 + num2;
                    double soma2 = num3 + num4;

                    // Exibindo os resultados
                    resultLabel1.setText("Resultado da Soma 1: " + soma1);
                    resultLabel2.setText("Resultado da Soma 2: " + soma2);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Exibindo a janela
        frame.setVisible(true);
    }
}

