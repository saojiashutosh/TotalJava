package TotalJava.TwoDArray;

import java.util.Scanner;

public class Basic2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[3][3];
        int n = 3, m = 3;

//        Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        search(array,10);
    }

    public static boolean search(int[][] array ,int key){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j]==key){
                    System.out.println("key found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
}
