import java.util.Scanner;
public class Patyki {
	public static boolean isTriangle(int a, int b, int c) {
		if ( a >= b + c || b >= a + c || c >= a + b ) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		System.out.println("Podaj d�ugo�ci trzech patyk�w");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();

		isTriangle(a, b, c);
		if (isTriangle(a, b, c)) {
			System.out.println("Nie b�dzie z tego tr�jk�tka ... ");
		} else {
			System.out.println("Gratulacje mo�esz u�o�y� tr�jk�t !");
		}
	}
}
		