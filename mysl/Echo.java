import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		String line;
		Scanner in = new Scanner(System.in);

		System.out.print("Napisz co�: ");
		line = in.nextLine();
		System.out.println("Napisa�e�: " + line);

		System.out.print("Napisz co� jeszcze: ");
		line = in.nextLine();
		System.out.println("Napisa�e� r�wnie�: " + line);
	}
}