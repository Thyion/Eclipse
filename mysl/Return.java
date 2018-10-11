import java.util.Scanner;
public class Return {
	public static void printLogarithm(double x) {
		if (x <= 0.0) {
			System.err.println("B³¹d: x musi byæ dodatnie.");
			return;
	
		}
		double result = Math.log(x);
		System.out.println("Logarytm x wynosi " + result);
	}
	public static void scanDouble() {
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj liczbê!");
		if (!in.hasNextDouble()) {
			String word = in.next();
			System.err.println(word + " nie jest liczb¹");
		return;
		}
		double x = in.nextDouble();
		printLogarithm(x);
	}
public static void main(String[] args) {
	scanDouble();	
		
	}		

}