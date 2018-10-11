import java.util.Scanner;

public class Zgadywanka {
	public static void zgadywanka(int line) {
		Scanner in = new Scanner(System.in);	
		if (line % 2 == 0) {
			if (line > 0) {
				System.out.println("Gratulacje wybra³eœ liczbê: " + line);
			} else {
				System.out.println("Jesteœ idiot¹!!! Liczba mia³a byæ wiêksza od 0 ... Wybieraj od nowa !");
				line = in.nextInt();
				zgadywanka(line);
			}
		} else { System.out.println("Jesteœ idiot¹!!! Liczba mia³a byæ parzysta ... Wybieraj od nowa !");
			line = in.nextInt();
			zgadywanka(line);
		}
	}
	public static void main(String[] args) {
		Scanner in = new  Scanner(System.in);		
		System.out.println("Czeœæ! Podaj dowoln¹ liczbê parzyst¹ wiêksz¹ od 0 :)");
		int line;
		line = in.nextInt();
		zgadywanka(line);
	}
}