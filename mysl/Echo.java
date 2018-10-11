import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		String line;
		Scanner in = new Scanner(System.in);

		System.out.print("Napisz coœ: ");
		line = in.nextLine();
		System.out.println("Napisa³eœ: " + line);

		System.out.print("Napisz coœ jeszcze: ");
		line = in.nextLine();
		System.out.println("Napisa³eœ równie¿: " + line);
	}
}