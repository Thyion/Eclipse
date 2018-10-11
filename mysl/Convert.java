import java.util.Scanner;
	public class Convert {
		public static void main(String[] args) {
		double cm;
		int inches, feet, remainder;
		final double CM_PER_INCH = 2.54;
		final int IN_PER_FEET = 12;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Ile dok³adnie centymetrów ?");
		cm = in.nextDouble();
		inches = (int) (cm / CM_PER_INCH);
		feet = inches / IN_PER_FEET;
		remainder = inches % IN_PER_FEET;
		System.out.printf ("%.2f cm = %d st. i %d cali\n",cm, feet, remainder);
		}
	}