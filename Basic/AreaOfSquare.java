	package TotalJava.Basic;

import java.util.Scanner;

public class AreaOfSquare {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side of square :");
		int side = sc.nextInt();
		int Area = side * side ;
		System.out.println("Area of the square is "+ Area);
		sc.close();
	}
}
