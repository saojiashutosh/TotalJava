package TotalJava.ConditionStatement;

import java.util.Scanner;

public class IncomeTaxCalculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int Income = sc.nextInt();
		System.out.println("Entered Income :"+ Income);
		float tax = 0;
		if(Income < 500000) {
			tax = 0 ;
		}
		else if (Income > 500000 && Income < 1000000){
			tax = Income * 0.2f;
		}
		else if(Income > 1000000) {
			tax = Income *0.3f;
		}
		
		System.out.println("Tax on the entered Income :"+ tax);
		System.out.println("Income after tax :"+ (Income - tax));
		sc.close();
	}
}
