package TotalJava.Function;

import java.util.Scanner;

public class BinomialCoefficient {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter value of n :");
        int n = sc.nextInt();
        System.out.print("Enter value of r :");
        int r = sc.nextInt();
        float bi_coeff = BinomialCoeff(n,r);
        System.out.println("Binomial Coefficient : " + bi_coeff);
    }

    private static int BinomialCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCoeff = (fact_n/(fact_nmr*fact_r));
        return binCoeff;
    }

    private static int factorial(int n) {
        int f = 1 ;
        for (int i = 1 ; i<=n ; i++){
            f = f * i ;
        }
        return f;
    }
}
