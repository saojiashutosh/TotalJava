package TotalJava.Arrays;

public class MaxiSubArraySumBruteForce {
    public static void main(String[] args){
        int[] array= {2,4,6,8,10};
        MaxsubArraySum(array);
    }
    private static void MaxsubArraySum(int[] array) {
        int currSum = 0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            int start = i;
            for(int j=i;j<array.length;j++){
                int end =j;
                currSum=0;
                for(int k =start;k<=end;k++){
                    currSum+=array[k];
                }
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max SubArray Sum : "+maxSum);
    }
}
