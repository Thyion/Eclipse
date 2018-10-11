public class Cwiczenie6_1 {
	public static boolean cwiczenie(int n) {
		if (n % 2 == 0) {
			System.out.println("dupa");
			return true;
		} else {
			System.out.println("kicha");
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(cwiczenie(2));
	}
}