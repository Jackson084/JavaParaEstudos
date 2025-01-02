package interfci;

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

        
    }
    
}
