import java.util.Random;
import java.util.Scanner;
	public class GraLiczbaLepsza {
		public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(100)+1;
		System.out.println("Myœlê o liczbie pomiêdzy 1 a 100.\nZgadniesz jaka to liczba ??");
		dopasowanie(number);
		}
		
	
		public static void dopasowanie(int number) {
			Scanner in = new Scanner(System.in);
			System.out.print("Podaj liczbê: ");
			int liczba;
			liczba = in.nextInt();
			if (liczba == number) {
				System.out.println("Twoja propozycja to: " + liczba);
				System.out.println("Gratulacje trafi³eœ !!!");
			} else {
				if (liczba > number) {
				System.out.println("Twoja propozycja to: " + liczba);
				System.out.println("Twoja liczba jest zbyt du¿a, spróbój ponownie");
				dopasowanie(number);
				} else {
				System.out.println("Twoja propozycja to: " + liczba);			
				System.out.println("Twoja liczba jest zbyt ma³a, spróbój ponownie");
				dopasowanie(number);
				}
			}
		
		}
	}