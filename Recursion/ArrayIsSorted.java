package TotalJava.Recursion;

public class ArrayIsSorted {
    public static void main(String[] args){
        int[] array = { 1,3,5,11,9};
        System.out.println(isSorted(array, 0 ));
    }

    public static boolean isSorted(int[] array,int i) {
        if(i == array.length-1){
            return true;
        }
        if(array[i]>array[i+1]){
            return false;
        }
         return isSorted(array,i+1);
    }
}
