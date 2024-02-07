package TotalJava.Recursion;

public class IncraseingNumber {
    public static void main(String[] args){
        int n = 1;
        printInc(n);
    }

    public static void printInc(int n) {
        if(n==10){
            System.out.println(10);
            return;
        }
        System.out.print(n+" ");
        printInc(n+1);
    }
}
