public class Odliczanie {
	public static void countdown(int n) {
		if(n == 0) {
			System.out.println("Odpalamy!");
		} else {
			System.out.println(n);
			countdown(n-1);
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		int n = 8;
		countdown(n);
	}	
}