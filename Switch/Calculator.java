package TotalJava.Switch;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1: Addition (+) ");
		System.out.println(" 2: Substraction (-) ");
		System.out.println(" 3: Multiplication (*) ");
		System.out.println(" 4: Division (/) ");
		System.out.println(" 5: Remainder (%) ");
		System.out.print(" Enter 1st number : ");
		int a = sc.nextInt();
		System.out.print(" Enter 2nd number : ");
		int b = sc.nextInt();
		System.out.print(" Enter your choice : ");
		char choice = sc.next().charAt(0);
		
		switch(choice) {
		case '+' : System.out.println(" Addition of two numbers : " + (a+b));
		           break;
		
		case '-' : System.out.println(" Substraction of two numbers : " + (a-b));
		           break;
		 
		case '*' : System.out.println(" Mutiplication of two numbers : " + (a*b));
		           break;
		
		case '/' : System.out.println(" Division of two numbers: " + (a/b));
		           break;
		
		case '%' : System.out.println(" Remainder of two numbers: " + (a%b));
		           break;
		
		default : System.out.println(" Please enter correct choice");
		}
	}

}
