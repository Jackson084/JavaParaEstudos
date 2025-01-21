import lig4.TuiLig4;

public class ConectFor implements TuiLig4 {
    private char[][] tab= new char[7][6];



    public void mostrartab(){
        desenharTab();
    }

    @Override
    public void desenharTab() {
        
        char[][] tabf = getTab();
        for (int i = 0; i < tabf.length; i++) {
            for (int j = 0; j < tabf[i].length; j++) {
                tabf[i][j]='.';
                System.out.print(tabf[i][j]);      
            }
            System.out.println();
                
        }
    }
    public char[][] getTab() {
        return tab;
    }

 

    
}
