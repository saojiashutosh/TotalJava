package TotalJava.Function;


import java.util.Scanner;

public class FunctionWithParameter {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();

        CalculateSum(a,b);
    }

    private static void CalculateSum(int a, int b) {
        int sum = a + b ;
        System.out.println("Sum of two numbers : " + sum);
    }
}
