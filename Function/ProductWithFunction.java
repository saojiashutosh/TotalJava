package TotalJava.Function;

import java.util.Scanner;

public class ProductWithFunction {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number :");
        int b = sc.nextInt();

        int prod = Mutilplication(a, b);
        System.out.print("Product of two number : " + prod);
    }

    private static int Mutilplication(int a, int b) {
        int prod = a * b ;
        return prod;
    }
}
