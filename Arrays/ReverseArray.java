package TotalJava.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] array= {2,4,6,8,10};
        reverse(array);
        System.out.println("Reverse array :");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void reverse(int[] array){
        int first = 0 , last = array.length-1;
        while(first<last){
            int temp = array[first];
            array[first]=array[last];
            array[last]=temp;
            first++;
            last--;
        }
    }
}
