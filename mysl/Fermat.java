public class Fermat {
	public static void checkFermat(int a, int b, int c, int n) {
		if (n > 2 && (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n))) {
			System.out.println("Kurka wodna, Fermat siê myli³!");
		} else {
			System.out.println("Nie, to nie dzia³a...");
		}
	}
	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int c = 2;
		int n = 3;
		checkFermat(a, b, c, n);
	}
}