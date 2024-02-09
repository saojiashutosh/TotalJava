package TotalJava.Recursion;

import java.util.Scanner;

public class XtoPowerNoptimised {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(powerOptimised(x,n));
    }
    public static int powerOptimised(int x, int n){
        if(n == 0){
            return 1 ;
        }

        int power = powerOptimised(x,n/2);
        int otpower = power * power ;

        if(n%2 != 0){
            otpower = x * otpower ;
        }

        return otpower ;
    }
}
