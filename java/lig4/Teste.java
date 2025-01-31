package lig4;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
       
       
        ConectFor lig4= new ConectFor();
        System.out.println(" digite (1) para x ou (2) para bola para saber quem começa: ");
        lig4.setVez(ler.nextInt()); 
        
        while (true){
            lig4.mostrartab();
            System.out.println(" digite a linha e coluna do "+lig4.getVez());
            if( lig4.jogar(ler.nextInt(), ler.nextInt())==false){ 
                System.out.println("linha ou coluna invalida, tente novamente");
                continue; 
            }
            if(lig4.verificarVitoria()!='*'){
                lig4.mostrartab();
                break;
            }


        }




        System.out.println("vencedor: " + lig4.verificarVitoria());
    }

    
}
