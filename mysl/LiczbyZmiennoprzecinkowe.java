public class LiczbyZmiennoprzecinkowe {
	public static void main(String[] args) {
		int hour = 11;
		int minute = 59;
		System.out.print("Aktualny czas to ");
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
		System.out.println(".");
		//nast�pna rzecz
		System.out.print("U�amek godziny, kt�ry up�yn��, to: ");
		System.out.println(minute/60);
		//nast�pna rzecz
		double minuta = 59.0;
		System.out.print("U�amek godziny, kt�ry up�yn��, to: ");
		System.out.println(minuta/60.0);
		//nast�pna rzecz
		double y = 1.0/5.0;
		System.out.println(y);
	}
}