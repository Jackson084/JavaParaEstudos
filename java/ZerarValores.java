import java.util.Scanner;

public class ZerarValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de números a serem digitados
        System.out.println("Digite a quantidade de números: ");
        int n = scanner.nextInt();

        // Cria o array para armazenar os números
        int[] numeros = new int[n];

        // Variável para controlar a posição atual no array
        int posicao = 0;

        System.out.println("Digite os números (0 para zerar valores anteriores):");
        while (posicao < n) {
            int entrada = scanner.nextInt();

            if (entrada == 0) {
                // Volta até encontrar um valor diferente de 0 e zera
                for (int i = posicao - 1; i >= 0; i--) {
                    if (numeros[i] != 0) {
                        numeros[i] = 0;
                        break;
                    }
                }
            } else {
                // Adiciona o número ao array e avança
                numeros[posicao] = entrada;
                posicao++;
            }
        }

        // Exibe o resultado final
        System.out.print("Resultado: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }
}
