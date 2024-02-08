package TotalJava.Recursion;

import java.util.Scanner;

public class XtoPowerN {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(x2pn(x,n));
    }

    public static int x2pn(int x, int n) {
        if(n == 1){
            return x * n ;
        }

        int xnm1 = x2pn(x,n-1);
        int xn = x * xnm1;
        return xn ;
    }
}
