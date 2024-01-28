package TotalJava.Practice;

public class BinarySearch {
    public static void main(String[] args){
        int[] array= { 1,5,6,9,23,98};
        int key = 23;
        int result = binarySearch(array,key);
        System.out.println(result);
    }

    public static int binarySearch(int[] array,int key){
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(array[mid]==key){
                return mid;
            } else if (array[mid]>key) {
                end=mid;
            }else {
                start=mid;
            }
        }
        return -1;
    }
}
