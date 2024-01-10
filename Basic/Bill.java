package TotalJava.Basic;

import java.util.Scanner;

public class Bill {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Cost of Pencil :");
		float pencil = sc.nextFloat();
		System.out.print("Enter Cost of Pen :");
		float pen = sc.nextFloat();
		System.out.print("Enter Cost of Eraser :");
		float eraser = sc.nextFloat();
		float bill = pencil + pen + eraser ;
		float bill2 = ((18*bill)/100)+bill;
		System.out.println("Your bill is : " + bill2);
		sc.close();
	}
}
