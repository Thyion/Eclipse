import java.util.Scanner;

public class Zgadywanka {
	public static void zgadywanka(int line) {
		Scanner in = new Scanner(System.in);	
		if (line % 2 == 0) {
			if (line > 0) {
				System.out.println("Gratulacje wybra�e� liczb�: " + line);
			} else {
				System.out.println("Jeste� idiot�!!! Liczba mia�a by� wi�ksza od 0 ... Wybieraj od nowa !");
				line = in.nextInt();
				zgadywanka(line);
			}
		} else { System.out.println("Jeste� idiot�!!! Liczba mia�a by� parzysta ... Wybieraj od nowa !");
			line = in.nextInt();
			zgadywanka(line);
		}
	}
	public static void main(String[] args) {
		Scanner in = new  Scanner(System.in);		
		System.out.println("Cze��! Podaj dowoln� liczb� parzyst� wi�ksz� od 0 :)");
		int line;
		line = in.nextInt();
		zgadywanka(line);
	}
}