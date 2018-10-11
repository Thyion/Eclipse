public class Cwiczenie6_8 {
	
	public static long ackerman(long m, long n) {
		long A;
		if (m == 0) {
			return A = n + 1;
		}
		if (m > 0 && n == 0) {
			return A = ackerman(m-1, 1);
		}
		if (m > 0 && n > 0) {
			return A = ackerman(m-1, ackerman(m, n-1));
	 	}
		return ackerman(m, n);
	}
	
	public static void main(String[] args) {
		System.out.println(ackerman(3, 2));
	}
}