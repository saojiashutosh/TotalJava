package TotalJava.Loops;

public class NumberReverse {
	public static void main(String args[]) {
		int n = 1558;
		while(n > 0) {
			 int a = n % 10 ;
			 System.out.print(a);
			  n = n / 10 ;
		}
	}

}
