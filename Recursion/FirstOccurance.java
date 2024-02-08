package TotalJava.Recursion;

public class FirstOccurance {
    public static void main(String[] args){
        int[] arr = { 8,3,6,9,10,2,5,3};
        System.out.println(firstOcc(arr,5,0));
    }

    public static int firstOcc(int[] arr, int key, int i) {
        if(i==arr.length){
            return -1 ;
        }
        if(arr[i]== key){
            return i ;
        }
        return firstOcc(arr , key , i+1);
    }
}
