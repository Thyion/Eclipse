public class MMatematyczne {
		public static void main(String[] agrs) {
		double root = Math.sqrt(17.9);
		double angle = 1.5;
		double height = Math.sin(angle);
		System.out.println("Kwadrat: " + root);
		System.out.println("K�t: " + angle);
		System.out.println("Wysoko��: " + height);

		double radians = Math.toRadians(180.0);
		double degrees = Math.toDegrees(2 * Math.PI);
		double kat = degrees/180*Math.PI;
		System.out.println("K�t: " + degrees);
		System.out.printf("K�t: %.4f\n", radians);
		System.out.println("K�t: " + kat);

		long x = Math.round(Math.PI);
		System.out.println(x);
	

		double y = Math.cos(angle + Math.PI/2);
		double z = Math.exp(Math.log(10.0));
		double a = Math.pow(2.0, 10.0);
		
		System.out.printf("%.2f , %.2f , %.2f",y, z, a);

	}

}