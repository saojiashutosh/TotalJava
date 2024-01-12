package TotalJava.SortingAlgorithm;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr={5,4,1,3,2};
        selectionSort(arr);
        printArr(arr);
    }

    private static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int curr = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[curr]>arr[j]){
                    curr=j;
                }
            }
            int temp = arr[curr];
            arr[curr]=arr[i];
            arr[i]=temp;
        }
    }

    public static void printArr(int[] arr) {
        System.out.print("Sorted Array : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
