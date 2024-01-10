package TotalJava.ConditionStatement;

import java.util.Scanner;

public class PositiveNegative {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int a = sc.nextInt();
		if (a>=0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is negative");
		}
	}

}
