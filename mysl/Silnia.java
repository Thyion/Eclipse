import java.util.Scanner;

public class Silnia {
	public static long factorial(long n) {
	
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}		

		
	}
	public static void main(String[] agrs) {
		long n;
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj dla jakiej liczby obliczyæ silnie.\n");
		n = in.nextLong();
		System.out.println(n + "! = " + factorial(n));
	}


}