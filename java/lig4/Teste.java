package lig4;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        ConectFor lig4= new ConectFor();

        lig4.jogar(0, 6);
        lig4.jogar(0, 0);
        lig4.jogar(1, 5);
        lig4.jogar(0, 1);
        lig4.jogar(2, 4);
        lig4.jogar(0, 2);
        lig4.jogar(3, 3);

        lig4.mostrartab();

         /**

        while (true){
            lig4.mostrartab();
            System.out.println(" digite a linha e coluna do "+lig4.getVez());
            if( lig4.jogar(ler.nextInt()-1, ler.nextInt()-1)==false){
                System.out.println("linha ou coluna invalida, tente novamente");
                continue;
            }
            if(lig4.verificarVitoria()!='*'){
                lig4.mostrartab();
                break;
            }


        }

**/


        System.out.println("vencedor: " + lig4.verificarVitoria());
    }

    
}
