public class BafflePing {
	public static void zoop() {
		baffle();
		System.out.print("Ty chcesz ");
		baffle();
	}

	public static void main(String[] args) {
		System.out.print("Nie, ja b�d� ");
		zoop();
		System.out.print("Ja b�d� ");
		baffle();
	}

	public static void baffle() {
		System.out.print("pracowa�");
		ping();
	}

	public static void ping() {
		System.out.println(".");
	}
}