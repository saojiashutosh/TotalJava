package TotalJava.ConditionStatement;

import java.util.Scanner;

public class PassOrFail {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks outof 100 : ");
		int marks = sc.nextInt();
		String status = marks > 33 ? "pass":"fail";
		System.out.println("Your result : " + status);
		sc.close();
	}

}
