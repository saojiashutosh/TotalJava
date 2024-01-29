package TotalJava.TwoDArray;

public class SpiralArray {

    public static void printSpiral(int[][] array){
        int startRow=0;
        int startCol=0;
        int endRow=array.length-1;
        int endCol=array[0].length-1;

        while (startRow<=endRow && startCol<=endCol){
//            top
            for (int j = startCol; j <=endCol ; j++) {
                System.out.print(array[startRow][j]+" ");
            }

//            right
            for (int i = startRow+1; i <=endRow ; i++) {
                System.out.print(array[i][endCol]+" ");
            }

//            bottom
            for (int j = endCol-1; j >=startCol ; j--) {
                System.out.print(array[endRow][j]+" ");
            }

//            left
            for (int i = endRow-1; i >=startRow ; i--) {
                System.out.print(array[i][startCol]+" ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
     public static void main(String[] args){
         int[][] array={{1,2,3,4},
                 {5,6,7,8},
                 {9,10,11,12},
                 {13,14,15,16}};
         printSpiral(array);
     }
}
