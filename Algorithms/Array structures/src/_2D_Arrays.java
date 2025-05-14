public class _2D_Arrays {
    public static void main(String[] args) {
        int [][] numbers= new int[5][4];
        for (int i=0;i<5;i++){
            for (int j=0;j<4;j++){
                numbers[i][j]=j+1;
                System.out.print(numbers[i][j]);
            }
            System.out.println();

        }
    }
}
