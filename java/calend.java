public class calend {
    public static void main(String[] args) {
        int[][] nunsdcalen= new int[5][5];
        int cont=0;
        for (int i = 0; i < nunsdcalen.length; i++) {
            for (int j = 0; j < nunsdcalen.length; j++) {
                cont++;
                nunsdcalen[i][j]=cont;
                System.out.print(nunsdcalen[i][j]);
            }
            System.out.println();
        }
    }
}
