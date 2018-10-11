public class OdliczanieLepsze {
	public static void countdown(int n) {
		while (n > 0) {
			System.out.println(n);
			n = n - 1;
		}
		System.out.println("Odpalamy!");
	}
	public static void main(String[] args) {
		int n = 8;
		countdown(n);
	}	
}