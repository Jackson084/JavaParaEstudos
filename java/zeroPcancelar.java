import java.util.Scanner;

public class zeroPcancelar {
    public static void main(String[] args) {
        Scanner ler= new Scanner (System.in);
        System.out.println("digite");
        int chefe = ler.nextInt();
        int[] nums=new int[chefe];
        for (int i = 0; i < chefe; i++) {
            System.out.println("digite");
            nums[i]=ler.nextInt();
            if(i==0 && nums[i]==0){
                nums[0]=0;

            }
            if(nums[i]==0){
                i--;
                nums[i]=0;
                i++;
                
                    
                
            }
           
        }
        int soma=0;
        System.out.println(" esses são os numeros");
        for (int i = 0; i < nums.length; i++) {
            soma=soma+nums[i];
          
        }
        System.out.println(soma);
    }
}
