package TotalJava.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int[] array={2,4,6,8,10,12};
        int key = 8;
        int point = binarySearch(array,key);
        System.out.println("Key is at " + point);
    }

    public static int binarySearch(int[] array ,int key){
        int start = 0;//2
        int end = array.length -1;//12
        while(start<=end){//0<5
            int mid = (start+end)/2;//3

            if(array[mid]==key){//8!=10
                return mid;
            }
            if (array[mid]<key){//8<10
                start=mid+1;//4
            }else
            {
                end=mid-1;//2
            }
        }
        return -1;
    }
}
