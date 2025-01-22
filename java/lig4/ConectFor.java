package lig4;

public class ConectFor implements TuiLig4 {
    private char[][] tab= new char[6][7];
    private char vez;
    private final char X ='x';
    private final char O ='o';

    public ConectFor(){
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
        }
        if(tab[linha][coluna]!=vez){
            tab[linha][coluna]=vez;
            vez = vez==X? O : X;
            return true;
        }else{
            return false;
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

    void mostrartab() {
        desenharTab();
    }
    public char verificarVitoria(){
        // verificação horizontal
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < 4; i++) {
                if (tab[j][i] == ' ') {
                    continue;
                }
                if (tab[j][i] == tab[j][i + 1] && tab[j][i] == tab[j][i + 2]
                        && tab[j][i] == tab[j][i + 3]) {
                    return tab[j][i];
                }
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
                }
            }
        }
        // verificar diagonal
        for (int i = 0; i < 6; i++) {
            for(int j=0; j<3; j++){
                int coluna= i<3? 0 : i-2;
                int linha= i>2? 0 : 2-i;

                int colunaAtual, linhaAtual;

                colunaAtual= coluna+j;
                linhaAtual= linha+j;

                if(linhaAtual+3>=6 || colunaAtual+3>=7){
                    break;
                }
                if (tab[linhaAtual][colunaAtual] == ' ') {
                    continue;
                }
                if (tab[linhaAtual][colunaAtual] == tab[linhaAtual+1][colunaAtual+1]
                    && tab[linhaAtual][colunaAtual] == tab[linhaAtual+2][colunaAtual+2]
                    && tab[linhaAtual][colunaAtual] == tab[linhaAtual+3][colunaAtual+3]) {

                    return tab[linhaAtual][colunaAtual];
                }

            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                int coluna = i < 3 ? 0 : i - 2;
                int linha = i >= 2 ? 5 : 3 + i;

                int colunaAtual, linhaAtual;

                colunaAtual = coluna + j;
                linhaAtual = linha - j;
                

                if (linhaAtual - 3 < 0 || colunaAtual + 3 >= 7) {
                    break;
                }
                if (tab[linhaAtual][colunaAtual] == ' ') {
                    continue;
                }
                if (tab[linhaAtual][colunaAtual] == tab[linhaAtual - 1][colunaAtual + 1]
                        && tab[linhaAtual][colunaAtual] == tab[linhaAtual - 2][colunaAtual + 2]
                        && tab[linhaAtual][colunaAtual] == tab[linhaAtual - 3][colunaAtual + 3]) {

                    return tab[linhaAtual][colunaAtual];
                }
            }
        }

        return '*';
    }

    public char getVez() {
        return vez;
    }
}
