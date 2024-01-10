package TotalJava.Arrays;

public class LargestInArray {
    public static void main(String[] args){
        int[] array ={1,2,6,3,5};
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];
            }
        }
        System.out.println("largest number in array : "+ largest);
    }
}
