import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Recebendo as três entradas
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número:");
        int num3 = scanner.nextInt();
        
        // Encontrando o segundo maior número
        int segundoMaior;
        
        if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
            segundoMaior = num1;
        } else if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
            segundoMaior = num2;
        } else {
            segundoMaior = num3;
        }
        
        System.out.println("O segundo maior número é: " + segundoMaior);
        
        scanner.close();
    }
}
