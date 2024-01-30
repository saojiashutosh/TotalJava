package TotalJava.TwoDArray;

public class TransposeOfMatrix {
    public static void main(String[] args){
        int[][] array={{1,2,3},{4,5,6}};
        int row = 2, column=3;
        int[][] transpose=new int[column][row];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                transpose[j][i]=array[i][j];
            }
        }

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
