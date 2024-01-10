package TotalJava.Loops;

import java.util.Scanner;

public class While1toN {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		int a = 1;
		while(a<=n) {
			System.out.println(a);
			a++;
		}
	}

}
