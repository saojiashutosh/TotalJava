package TotalJava.Loops;

import java.util.Scanner;

public class SumOfNaturalNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range ");
		int n = sc.nextInt();
		int a=1;
		int sum = 0;
		while(a<=n) {
			sum = sum + a ;
			a++;
		}
		System.out.println("Sum of first n natural numbers : " + sum);
		sc.close();
	}

}
