package TotalJava.Recursion;

public class DecreasingNumber {
    public static void main(String [] args){
        int n = 10 ;
        printDec(n);

    }

    public static void printDec(int n) {
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1);
    }
}
