package TotalJava.Recursion.Practise;
//For a given integer array of size N.
// You have to find all the occurrences(indices) of a given element(Key) and print them.
// Use a recursive function to solve this problem.
// Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2 , Sample Output: 1 5 7 8
public class IntegerArray {
    public static void main(String[] args){
        int[] arr={3,2,4,5,6,2,7,2,2};
        int key = 2;
        integerArray(arr,0,key);
    }

    public static void integerArray(int[] arr,int n,int key) {
        if(n==arr.length){
            return ;
        }
        if (arr[n] == key) {
            System.out.print(n+" ");
        }
        integerArray(arr, n+1, key);
    }
}
