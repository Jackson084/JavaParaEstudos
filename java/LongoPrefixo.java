/*Escreva uma função para encontrar a maior string de prefixo 
comum entre uma matriz de strings.

Se não houver um prefixo comum, retorne uma string vazia "".

Exemplo 1:
Entrada: strs = ["flor","fluxo","voo"]
 Saída: "fl"

 Exemplo 2:
Entrada: strs = ["cachorro","carro de corrida","carro"]
 Saída: ""
 Explicação: Não há um prefixo comum 
 entre as strings de entrada.
  */
public class LongoPrefixo {
    public static void main(String[] args) {
        String[] lp={"flow"," flaqui","voo"};
        System.out.println(longestCommonPrefix(lp));
        int n=10;
        String n1=String.valueOf(n);
        System.out.println(n1);
        System.out.println();
        int x=1234321;
        System.out.println(isPalindrome(x));
        
    }
    public static String longestCommonPrefix(String[] strs) {
            //StringBuilder str = new StringBuilder();
        for(int i=0; i<strs.length; i++){
            if(strs[i].contains("fl")){
                    //str="fl";
                return "fl";
            }
        }
        return "";
    }
    public static boolean isPalindrome(int x) {
        String polidromo=String.valueOf(x);
        char cu=' ';
        String plInvertido="";
        for(int i=polidromo.length()-1; i>=0; i--){
            cu=polidromo.charAt(i);
            plInvertido=plInvertido+cu;
        }
        
        if(plInvertido.equals(polidromo)){
            return true;
        }
        return false;
    }
    
}
