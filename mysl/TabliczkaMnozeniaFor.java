import java.util.Scanner;

public class TabliczkaMnozeniaFor {
	public static void printRow(int n, int cols) {
		//for (int i = 1; i <= cols; i ++) {
			//System.out.printf("%6d", n * i);
		//}
		int i = 1;
		while (i <= cols) {
			System.out.printf("%6d", n * i);
			i = i + 1;
		}
		System.out.println(); //pamietaj ze w while mozesz wywolac zmienne z jej srodka
	}
	public static void printTable(int row, int cols) {
		for (int i = 1; i <= row; i ++) {
			printRow(i,cols);
		}
		// pamietaj ze w for nie mozesz wywolac zmiennej ze srodka , 
		//istnieje ona tylkow  for


		//int i = 1;
		//while (i <= row) {
			//printRow(i,cols);
			//i ++;
		//}
	}
	
	public static void main(String[] args) {
		int row = (hasNextRow());
		int col = (hasNextCol());
		printTable(row,col);
		
		
	}
	public static int hasNextRow() {
		Scanner in = new Scanner(System.in);
		boolean okay;
		do {
			System.out.println("Jak du¿a ma byc tabliczka mno¿enia ???");
			System.out.println("Podaj liczbê wierszy: ");
			if (in.hasNextInt()) {
				okay = true;
			} else {
				okay = false;
			String word = in.next();
			System.err.println(word + " nie jest liczb¹");
			}
		} while (!okay);
		int row = in.nextInt();
		return row;
		
	}
	public static int hasNextCol() {
		Scanner in = new Scanner(System.in);
		boolean okay;
		do {
			System.out.println("Jak du¿a ma byc tabliczka mno¿enia ???");
			System.out.println("Podaj liczbê kolumn: ");
			if (in.hasNextInt()) {
				okay = true;
			} else {
				okay = false;
			String word = in.next();
			System.err.println(word + " nie jest liczb¹");
			}
		} while (!okay);
		int col = in.nextInt();
		return col;
		
	}
}