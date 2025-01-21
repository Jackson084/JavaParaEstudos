package lig4;

public class Teste {
    public static void main(String[] args) {
        ConectFor lig4= new ConectFor();

        lig4.mostrartab();
        lig4.jogar(1, 4);
        lig4.jogar(0,5);
        lig4.jogar(1, 1);
        lig4.jogar(1,5);
        lig4.jogar(1, 2);
        lig4.jogar(2, 5);
        lig4.jogar(5, 3);
        lig4.jogar(3, 5);


        lig4.mostrartab();
        System.out.println(lig4.verificarVitoria());
    }
    
}
