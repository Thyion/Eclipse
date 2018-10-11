public class Cwiczenie6_4 {
	public static Double multadd(double a, double b, double c) {
		double x = a * b + c;
		return x;
	}
	public static Double multadd2() {
		double y = (Math.sin(Math.PI/4) + (Math.cos(Math.PI/4) / 2));
		return y;
	}
	public static Double expSum(Double x) {
		double z = x * Math.exp(-x) + Math.sqrt((1 - Math.exp(-x))); 
		return z;
	}
	public static Double pierwiastek(double v, double b) {
		double q = Math.log(v) + Math.log(b);
		return q;
	}
	public static void main(String[] args) {
		double x = multadd(1.0, 2.0, 3.0);		
		System.out.println(multadd(1.0, 2.0, 3.0));
		System.out.printf("%.2f\n", multadd2());
		System.out.printf("%.3f\n", expSum(x));
		System.out.println(pierwiastek(x, expSum(x)));
		
	}
}