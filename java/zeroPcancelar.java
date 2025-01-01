import java.util.Scanner;

public class zeroPcancelar {
    public static void main(String[] args) {
        Scanner ler= new Scanner (System.in);
        System.out.println("digite");
        int chefe = ler.nextInt();
        int[] nums=new int[chefe];
        int cont=0;
        int cont2=0;
        for (int i = 0; i < chefe; i++) {
            //cont++;
            System.out.println("digite ó "+(i+1)+"° numero");
            nums[i]=ler.nextInt();
        }
        for (int i = nums.length-1; i>=0; i--) {
            if(nums[i]==0){
                int guardar=0;
                for (int j = nums.length-1; j>=0; j--) {
                    if(nums[j]!=0){
                        nums[j]=0;
                        guardar=nums[j];
                    }
                }
                
            }
        }
        
        
        int soma=0;
        System.out.println(" esses são os numeros");
        System.out.println(cont);
        for (int i = 0; i < nums.length; i++) {
            soma=soma+nums[i];
          
        }
        System.out.println("essa é a soma "+soma);
    }
}
