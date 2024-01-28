package TotalJava.SortingAlgorithm;

public class InsertionSort {
    public static void main(String[] args){
       int[] array={7,8,3,2,1};
       int[] sorted= insertionSort(array);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }

    public static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int curr=array[i];
            int j=i-1;
            while(j>=0 && array[j]>curr){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=curr;
        }
        return array;
    }
}
