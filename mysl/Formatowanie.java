public class Formatowanie {
	public static void main (String[] args) {
		System.out.println(4.0 / 3.0);
		System.out.printf("%.3f\n", 4.0 / 3.0);
		int inch = 100;
		final double CM_PER_INCH = 2.54;
		double cm = inch * CM_PER_INCH;
		System.out.printf("%04d - %.3f",inch,cm);
		
	}
}