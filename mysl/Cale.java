import java.util.Scanner;

public class Cale {
	public static void main(String[] args) {
		int inch;
		double cm;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ile cali?");
		inch = in.nextInt();
	
		final double CM_PER_INCH = 2.54;
		cm = inch * CM_PER_INCH;
		System.out.print(inch + " cali = ");
		System.out.println(cm + " cm");
	}
}