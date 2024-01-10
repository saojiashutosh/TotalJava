package TotalJava.Arrays;

public class PrefixSum {
    public static void main(String[] args){
        int[] array = {1,-2,6,-1,3};
        prefixSum(array);
    }

    private static void prefixSum(int[] array) {
        int[] prefixArray = new int[array.length];
        prefixArray[0]=array[0];
        for(int i =1;i<array.length;i++){
            prefixArray[i]=prefixArray[i-1]+array[i];
        }
        System.out.print("Prefix Array : ");
        for(int i=0;i<prefixArray.length;i++){
            System.out.print(prefixArray[i]+" ");
        }

        System.out.println();

        int currSum = 0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            int start = i;
            for(int j=i;j<array.length;j++){
                int end =j;
                currSum= start == 0 ? prefixArray[end] : prefixArray[end]-prefixArray[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max SubArray Sum : "+maxSum);
    }
}
