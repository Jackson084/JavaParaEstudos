package lig4;

public class Teste {
    public static void main(String[] args) {
        ConectFor lig4= new ConectFor();

        lig4.mostrartab();
        lig4.jogar(1, 4);
        lig4.jogar(0,0);
        lig4.jogar(1, 1);
        lig4.jogar(4,4);
        lig4.jogar(1, 2);
        lig4.jogar(4, 1);
        lig4.jogar(1, 3);

        lig4.mostrartab();
        System.out.println(lig4.verificarVitoria());
    }
    
}
