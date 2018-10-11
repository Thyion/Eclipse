import java.util.Random;
import java.util.Scanner;
	public class GraLiczba {
		public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(100)+1;
		System.out.println("Myœlê o liczbie pomiêdzy 1 a 100.\nZgadniesz jaka to liczba ??");
		Scanner in = new Scanner(System.in);
		System.out.print("Podaj liczbê: ");
		int liczba;
		liczba = in.nextInt();
		System.out.println("Twoja propozycja to: " + liczba);
		System.out.println("Liczba o której myœla³em, to: " + number);
		System.out.println("Pomyliles siê o: " + Math.abs(number-liczba));
	}
}