import java.util.Scanner;
	public class Zaokraglenie {
		public static void main(String[] args) {
			String line;
			Scanner in = new Scanner(System.in);
			System.out.print("Ile centymetrów ?");
			line = in.nextLine();
			double cent = Double.parseDouble(line);  //zamiana z string na double
			//double cent = 2;
			int inch;
			double CM_PER_INCH = 2.54;
			inch = (int) (cent / CM_PER_INCH);
			System.out.printf("%.2f cm = %d cali\n", cent, inch);
		}
	}