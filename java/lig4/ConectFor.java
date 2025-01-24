package lig4;

public class ConectFor implements TuiLig4 {
    private char[][] tab= new char[6][7];
    private char vez;
    private final char X ='x';
    private final char O ='o';

    public ConectFor(){
        for (int index = 0; index < 5; index++) {
            System.out.println();
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length ; j++) {
                tab[i][j] = ' ';
            }
        }
        this.vez=X;
    }
    public boolean jogar(int linha, int coluna){
        if(linha > 5 || linha < 0 || coluna > 6 || coluna < 0 ){
            return false;
        } // se qualquer uma dessas condiçãoes forem atendidas retorna falso
        if(tab[linha][coluna]!=vez){
            tab[linha][coluna]=vez;
            if(vez == X){
                vez=O;
            }else{
                vez=X;
            }//troca os jogadores 
            return true; // retorna verdadeiro por tudo estar certo
        }else{
            return false; // retorna falso em ultimo caso
        }

    }


    @Override
    public void desenharTab() {
        System.out.println("  1 2 3 4 5 6 7");
        for (int i = 0; i < tab.length; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < tab[0].length; j++) {
                System.out.print(tab[i][j]);
                if(j<6){
                    System.out.print("|");
                }
            }
            if(i<5) {
                System.out.println("\n  -------------");
            }
        }
        System.out.println();
        System.out.println();
    }
    public char[][] getTab() {
        return tab;
    }
    public void mostrartab() {
        desenharTab();
    }
    public char verificarVitoria(){
        // verificação horizontal
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < 4; i++) {
                if (tab[j][i] == ' ') {// se o tabuleiro for vazio na linha e na coluna ele continua para a proxima posição
                    continue;
                }
                if (tab[j][i] == tab[j][i + 1] && tab[j][i] == tab[j][i + 2] //se tabuleiro i e j for igual a o tabuleiro j e i+1 E
                        && tab[j][i] == tab[j][i + 3]) { // for igual a o tabuleiro j e i+2 e igual o tabuleiro j e i+3
                    return tab[j][i]; // retorna o ganhador se a condição for atendida
                } //em outras palavras se a colunas atual for igaul as 3 proximas colunas, ele retorna o vencedor do horizontal
            }
        }
        // verificação verticl
        for (int c = 0; c < tab[0].length; c++) {
            for (int l = 0; l < 3; l++) {
                if (tab[l][c] == ' ') {
                    continue;
                }
                if (tab[l][c] == tab[l+1][c] && tab[l][c] == tab[l+2][c]
                        && tab[l][c] == tab[l+3][c]) {

                    return tab[l][c];
                } // aqui é a mesma coisa
            }// se o tabuleiro na linha atual for igual as 3 proximas linhas 
        }
        // verificar diagonal
        for (int i = 0; i < 6; i++) { // existe 6 chances de vitoria
            for(int j=0; j<3; j++){  // aqui o j amnda 3 vezes sempre que o i sobe um
                int coluna, linha; 
                if(i<3){
                    coluna=0;
                }else{
                    coluna=i-2;
                }
                if(i>2){
                    linha=0;
                }else{
                    linha=2-i;
                }

                int colunaAtual, linhaAtual;

                colunaAtual= coluna+j;
                linhaAtual= linha+j;

                if(linhaAtual+3>=6 || colunaAtual+3>=7){
                    break;
                }// para garantir que não saira das bordas
                if (tab[linhaAtual][colunaAtual] == ' ') {
                    continue;
                }
                if (tab[linhaAtual][colunaAtual] == tab[linhaAtual+1][colunaAtual+1]
                    && tab[linhaAtual][colunaAtual] == tab[linhaAtual+2][colunaAtual+2]
                    && tab[linhaAtual][colunaAtual] == tab[linhaAtual+3][colunaAtual+3]) {

                    return tab[linhaAtual][colunaAtual];
                }// se a linha e a coluna atual for igual as 3 proximas colunas diagonais a esquerda (\) ele retorna o ganhador da diagonal a esquerda

            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                int linha, coluna;
                if(i<3){
                    coluna=0;
                }else{
                    coluna=i-2;
                }
                if(i>=2){
                    linha=5;
                }else{
                    linha=3+i;
                }// mesama coisa aqui com uma pequena diferença
           

                int colunaAtual, linhaAtual;

                colunaAtual = coluna + j;
                linhaAtual = linha - j;
                

                if (linhaAtual - 3 < 0 || colunaAtual + 3 >= 7) {
                    break;
                }// pra não sair das bordas
                if (tab[linhaAtual][colunaAtual] == ' ') {
                    continue;
                }
                if (tab[linhaAtual][colunaAtual] == tab[linhaAtual - 1][colunaAtual + 1]
                        && tab[linhaAtual][colunaAtual] == tab[linhaAtual - 2][colunaAtual + 2]
                        && tab[linhaAtual][colunaAtual] == tab[linhaAtual - 3][colunaAtual + 3]) {

                    return tab[linhaAtual][colunaAtual];
                }// agora aqui verifica as colunas a direita (/) retorna seu ganhador
            }
        }

        return '*';
    }

    public char getVez() {
        return vez;
    }
    public void setVez(char troca){
        if(troca=='x'){
            vez=X;
        }else if(troca=='o'){
            vez=O;
        }else{
            vez=X;
        }
        
    }
}
