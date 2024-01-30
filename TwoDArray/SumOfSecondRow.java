package TotalJava.TwoDArray;

public class SumOfSecondRow {
    public static void main (String[] args){
        int[][] nums = {{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                sum+=nums[i][j];
            }
            break;
        }
        System.out.println(sum);
    }
}
