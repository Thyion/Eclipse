import java.util.Scanner;

public class PierwiastekKwadratowy {
	
	public static void squareRoot(double a) {
		
		double i;
		double x0 = a / 2;
		double x = 2;
		double y = ((x0 + a / x0) / 2);
		i = Math.abs(x0 - y);
		while (i >= 0.0001) {
			x = ((y + a / y) / 2);
			System.out.printf("%.5f", x);
			System.out.println();	
			i = Math.abs(y - x);
			y = x;
		}
		
		System.out.print("Wartoœæ pierwiastka kwadratowego z liczby " + a + " to: ");
		System.out.printf("%.4f", x);
		System.out.println();
	}

		
	public static void main(String[] agrs) {
		number();
	}
	public static void number() {
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj dodatni¹ liczbê z jakiej mam policzyæ pierwiastek.");
		if (!in.hasNextDouble()) {
			String word = in.next();
			System.err.println(word + " nie jest liczb¹. Musisz podaæ liczbê");
		number();
		}
		double x = in.nextDouble();
		if (x <= 0) {
			System.err.println("B³¹d: Liczba musi byæ dodatnia.");
			number();
		}
		squareRoot(x);
	}
}