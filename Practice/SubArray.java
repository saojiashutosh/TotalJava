package TotalJava.Practice;

public class SubArray {
    public static void main(String[] args){
        int[] array= { 5,6,1,9,23,6,98};
        for (int i = 0; i < array.length; i++) {
            int start=i;
            for (int j = 0; j < array.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(array[k]);
                }
                System.out.println();
            }
        }
    }
}
