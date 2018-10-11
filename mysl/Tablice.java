public class Tablice {
	
	public static void main(String[] agrs) {
		int i = 1;
		while (i < 10) {
			double x = (double) i;
			System.out.println(x + "  " + Math.log(x) / Math.log(2));
			i = i + 1;
		}
	}
}