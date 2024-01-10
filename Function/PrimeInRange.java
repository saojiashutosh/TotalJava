package TotalJava.Function;

public class PrimeInRange {
    public static void main (String[] args){
        primeinRange(20);
    }

    private static void primeinRange(int n) {
        for(int i=1;i<=n;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isPrime(int n) {
        boolean isPrime=true;
        for(int i =1;i<=n;i++){
           if(n%2==0){
               isPrime=false;
               break;
           }
        }
        return isPrime;
    }
}
