package TotalJava.Recursion;

public class Factorial {
    public static void main(String[] args){
        int n=5 ;
        System.out.println(fact(n));
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fc = n * fact(n-1);
        return fc;
    }
}
