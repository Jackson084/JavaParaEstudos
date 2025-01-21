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

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                System.out.print(tab[i][j]);
                if(j<6){
                    System.out.print("|");
                }

            }
            if(i<5) {
                System.out.println("\n-------------");
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

        return '*';
    }


    
}
