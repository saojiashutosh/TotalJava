package TotalJava.Recursion;

public class Fibonacci {
    public static void main(String[] args){
        int n = 8 ;
        System.out.println(fibNum(n));
    }

    public static int fibNum(int n) {
        if(n==1 || n==0){
            return n ;
        }
        int fi1 = fibNum(n-1);
        int fib2 = fibNum(n-2);
        int fib = fibNum(n-1)+fibNum(n-2);
        return fib;
    }
}
