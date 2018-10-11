import java.util.Scanner;
	public class Konwerter {
		public static void main(String[] args) {
		int sec, minute, hour, remainder, sekunda;
		Scanner in = new Scanner(System.in);
		System.out.print("Podaj liczbê sekund: ");
		sec = in.nextInt();
		hour = sec/3600;
		remainder = sec % 3600;
		minute = remainder / 60;
		sekunda = remainder % 60;
		System.out.printf("%d Sekund = %d Godzin, %d Minut, %d Sekund",sec ,hour ,minute ,sekunda);
	}
}
		