package TotalJava.SortingAlgorithm;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,4,1,3,2};
        sorting(arr);
        printArr(arr);
    }
    public static void sorting(int[] arr) {
        for(int i=0;i<arr.length-1;i++){//number of iteration
            for(int j=0;j<arr.length-1-i;j++){//comparing elements
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        System.out.print("Sorted Array : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
