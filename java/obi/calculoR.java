package obi;
import java.util.Scanner;
public class calculoR {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de S: ");
        int S = ler.nextInt();
        System.out.println("Digite o valor de n: ");
        int n = ler.nextInt();
        System.out.println("Digite o valor de m: ");
        int m = ler.nextInt();
        int cont = 0;
        
        for (int i = n; i <= m; i++) {
            String s = String.valueOf(i);
            int[] digitos = new int[s.length()];
            
            // Primeiro, vamos armazenar todos os dígitos do número
            for (int j = 0; j < s.length(); j++) {
                digitos[j] = Character.getNumericValue(s.charAt(j));
            }
            
            // Agora verificamos as somas de pares consecutivos
            for (int j = 0; j < digitos.length - 1; j++) {
                if (digitos[j] + digitos[j + 1] == S) {
                    cont++;
                }
            }
        }
        
        System.out.println("resultado: " + cont);
        ler.close();
    }
}
