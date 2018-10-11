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
		System.out.println("Podaj d³ugoœci trzech patyków");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();

		isTriangle(a, b, c);
		if (isTriangle(a, b, c)) {
			System.out.println("Nie bêdzie z tego trójk¹tka ... ");
		} else {
			System.out.println("Gratulacje mo¿esz u³o¿yæ trójk¹t !");
		}
	}
}
		