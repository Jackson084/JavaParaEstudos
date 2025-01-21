package lig4;

public class ConectFor implements TuiLig4 {
    private char[][] tab= new char[7][6];

    @Override
    public void desenharTab() {
        
        char[][] tab = getTab();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j]='.';
                System.out.print(tab[i][j]);      
            }
            System.out.println();
                
        }
    }
    public char[][] getTab() {
        return tab;
    }

    void mostrartab() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
