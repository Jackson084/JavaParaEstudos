package lig4;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        /* não sei se a formatação vai ficar certinha, tipo, 1 2 3 4 5 6 7 
        da parte de cima pq no 
        inteliji tava normal, mas no vscode não tá */
       
        ConectFor lig4= new ConectFor();
        System.out.println(" digite (x) ou (o)  para saber qm começa: ");
        lig4.setVez(ler.next().charAt(0)); //não existe o escanner pro char então se usa o escanner com o charAt na posição desejada para obter o valor
        
        while (true){
            lig4.mostrartab();
            System.out.println(" digite a linha e coluna do "+lig4.getVez());
            if( lig4.jogar(ler.nextInt()-1, ler.nextInt()-1)==false){ // normalmente se digitar 1 ele vai na segunda posição, mas aqui ele vai na primeira, já que está diminuindo (1)
                System.out.println("linha ou coluna invalida, tente novamente");
                continue; //continua sem trocar o jogador caso essa condição seja verdadeira
            }
            if(lig4.verificarVitoria()!='*'){
                lig4.mostrartab();
                break;
            }


        }




        System.out.println("vencedor: " + lig4.verificarVitoria());
    }

    
}
