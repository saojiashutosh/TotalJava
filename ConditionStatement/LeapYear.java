package TotalJava.ConditionStatement;

import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year :");
		int year = sc.nextInt();
		boolean x = (year%4)==0; 
		boolean y = (year % 100)!= 0;
		boolean z = ((year%100==0) && (year%400==0));
		if (x && (y || z)) {
			System.out.println("Year is a Leap Year");
		}
		else {
			System.out.println("Year is not Leap Year");
		}
		sc.close();
	}

}
