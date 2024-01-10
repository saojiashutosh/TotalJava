package TotalJava.Loops;

import java.util.*;

public class PrimeOrNot {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean isPrime = true ;
        for (int i = 2 ; i < Math.sqrt(n) ; i++){
            if (n % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
    }
}
