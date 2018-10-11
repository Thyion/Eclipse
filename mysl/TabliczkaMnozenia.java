import java.util.Scanner;

public class TabliczkaMnozenia {
	public static void printRow(int n, int cols) {
		int i = 1;
		while (i <= cols) {
			System.out.printf("%6d", n * i);
			i = i + 1;
		}
		System.out.println();
	}
	public static void printTable(int row, int cols) {
		int i = 1;
		while (i <= row) {
			printRow(i,cols);
			i ++;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Jak du¿a ma byc tabliczka mno¿enia ???");
		System.out.println("Podaj liczbê kolumn: ");
		int kolumna = in.nextInt();
		System.out.println("Teraz podaj liczbê wierszy: ");
		int wiersze = in.nextInt();
		System.out.println("Oto Twoja nowoczesna superowa tabliczka mno¿enia !!!");
		printTable(kolumna,wiersze);
	}
}