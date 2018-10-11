import java.util.Scanner;
	public class Bug {
		public static void main(String[] args) {
		String name;
		int age;
		Scanner in = new Scanner(System.in);
		System.out.print("Jak siê nazywasz? ");
		name = in.nextLine();
		System.out.print("Ile masz lat? ");
		age = in.nextInt();
		System.out.printf("Witaj, %s, lat %d\n", name,age);

		System.out.print("Ile masz lat? ");
		age = in.nextInt();
		in.nextLine();
		System.out.print("Jak siê nazywasz? ");
		name = in.nextLine();
		System.out.printf("Witaj, %s, lat %d\n", name,age);
	}
}