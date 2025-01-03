package interfci;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Interfaci {
    public static void main(String[] args) {
        JFrame jFrame= new JFrame(); // objeto jframe
        jFrame.setVisible(true); // visibilidade da janela
        jFrame.setSize(500, 400); // tamanho da janela
        jFrame.setTitle(" começando "); // titulo da janela
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE); // finalizar programa quando a janela é fechada
        jFrame.setResizable(false); // impede ajuste da janela quando o programa foi execultado
        jFrame.setLocationRelativeTo(null); // local que a janela aparecerá, nesse caso, ela aparecera no meio
        jFrame.setLayout(null);

        JButton jbutton = new JButton(" clique aqui"); // mensagem do botão
        jbutton.setText("Botão"); // modificar mensagem
        jbutton.setBounds(100, 200, 200, 90); // modifica o canto que o botão estara
        jbutton.setFont(new Font("Arial", Font.ITALIC, 40)); // modifica a fonte o estio e o tamanho da mensagem dentrp dp botão
        jbutton.setForeground(new Color(50, 50, 100)); // modifca a cor da letra
        jbutton.setBackground(new Color(100, 20, 30)); // modifica a cor de fundo do botão
        jFrame.add(jbutton);
    }
    
}
