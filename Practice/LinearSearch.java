package TotalJava.Practice;

public class LinearSearch {
    public static void main(String[] args){
        int[] array= { 5,6,1,9,23,6,98};
        int key = 23;
        int result = linearSearch(array,key);
        System.out.println(result);
    }

    public static int linearSearch(int[] array,int key){
        int result = 0;
        for(int i=0 ; i<array.length;i++ ){
            if(array[i]==key){
                result = i;
            }
        }
        return result;
    }
}
