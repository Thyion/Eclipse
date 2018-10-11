public class BafflePing {
	public static void zoop() {
		baffle();
		System.out.print("Ty chcesz ");
		baffle();
	}

	public static void main(String[] args) {
		System.out.print("Nie, ja bêdê ");
		zoop();
		System.out.print("Ja bêdê ");
		baffle();
	}

	public static void baffle() {
		System.out.print("pracowaæ");
		ping();
	}

	public static void ping() {
		System.out.println(".");
	}
}