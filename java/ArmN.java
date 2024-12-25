import java.util.Scanner;

public class ArmN{
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        /* 
        String[] names= new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.println();
            System.out.println("digite o "+(i+1)+"° nome: ");
            names[i]=ler.nextLine();
        }*/
        String[] nomeUsuario = new String[3];
        
        // Entrada dos nomes
        for (int i = 0; i < nomeUsuario.length; i++) {
            System.out.print("\nDigite o seu nome: ");
            nomeUsuario[i] = ler.nextLine();
        }

        // Formatar os nomes
        String[] nomesFormatados = capitalizarNomes(nomeUsuario);

        // Exibir os nomes formatados
        System.out.println("\nNomes formatados:");
        for (String nome : nomesFormatados) {
            System.out.println(nome);
        }
        System.out.println("procure um nome");
        String procurarN=ler.nextLine();
        for (String achar : nomesFormatados) {
            if(procurarN.equals(achar)){
                System.out.println(" nome encontrado: ");
                System.out.println(achar);
            }else{
                System.out.println("nome não encontrado: ");
            }
            
        }

        ler.close();
    }

    // Método para capitalizar a primeira letra de cada palavra em uma lista de nomes
    public static String[] capitalizarNomes(String[] nomes) {
        String[] nomesFormatados = new String[nomes.length];

        for (int i = 0; i < nomes.length; i++) {
            String[] palavras = nomes[i].split(" "); // Divide cada nome em palavras
            StringBuilder nomeFormatado = new StringBuilder();

            for (String palavra : palavras) {
                if (palavra.length() > 0) {
                    // Converte a primeira letra para maiúscula e o restante para minúscula
                    nomeFormatado.append(Character.toUpperCase(palavra.charAt(0)))
                                 .append(palavra.substring(1).toLowerCase())
                                 .append(" ");
                }
            }

            // Armazena o nome formatado no array
            nomesFormatados[i] = nomeFormatado.toString().trim(); // Remove espaço extra no final
        }

        return nomesFormatados;
    }
}
        

        