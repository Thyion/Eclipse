import java.util.Scanner;
	public class Fahrenheit {
		public static void main(String[] args) {
		double cel;
		double fah;
		Scanner in = new Scanner(System.in);
		System.out.print("Ile stopni Celciusa ?");
		cel = in.nextDouble();
		fah = cel*9/5+32;
		System.out.printf("%.2f stopni Celciusa = %.2f stopni Fahrenheita",cel ,fah);
	}
}