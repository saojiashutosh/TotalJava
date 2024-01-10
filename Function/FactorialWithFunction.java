package TotalJava.Function;

import java.util.Scanner;

public class FactorialWithFunction {
    public static void main ( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int fact = Factorials(num);
        System.out.print("Factorial of number : " + fact );
    }

    private static int Factorials(int num) {
        int fact = 1 ;
        for (int i = 1 ; i<=num ; i ++){
            fact = fact * i ;
        }
        return fact;
    }
}
