package TotalJava.Recursion;

import java.util.Stack;

public class SumNNaturalNos {
    public static void main(String[] args){
        int n = 5;
        System.out.println(CalSum(n));
    }

    public static int CalSum(int n) {
        if (n == 1) {
            return 1;
        }
        int nm1 = CalSum(n-1);
        int sum = n + CalSum(n-1);
        return sum;
    }
}
