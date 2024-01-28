package TotalJava.Practice;

public class SubArraySum {
    public static void main(String[] args){
        int[] array= { 5,6,1,9,23,6,98};
        int maxSum=Integer.MIN_VALUE;
        int currSum= 0;
        for (int i = 0; i < array.length; i++) {
            int start=i;
            for (int j = 0; j < array.length; j++) {
                int end = j;
                currSum=0;
                for (int k = start; k <= end; k++) {
                    currSum+=array[k];
                }
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
