package TotalJava.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int key = 10;
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16};
        int result = linearSearch(array, key);
        if (result==-1){
            System.out.println("Key not found !!");
        }else {
            System.out.println("Key found at "+ result);
        }
    }

    public static int linearSearch(int[] array, int key) {
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
}
