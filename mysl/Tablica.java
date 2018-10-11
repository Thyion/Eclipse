import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Tablica {
	
	public static void printArray(int[] counts) {
		System.out.print("[" + counts[0]);
		for (int i = 1; i < counts.length; i++) {
			System.out.print("," + counts[i]);
		}
		System.out.println("]");
		System.out.println(Arrays.toString(counts));	// komenda do drukowania tablicy
	}
	
	//kopiowanie tablic
	public static void copy(int[] counts) {
		int[] b = new int[counts.length];
		for (int i = 0; i < counts.length; i++) {
			b[i] = counts[i];
		}
		int[] c = Arrays.copyOf(counts, 4);  //komenda kopiowania tablicy
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
	
	// dzia³anie na tablicy (przechodzeni tablicy)
	// w tym przypadku do potegi 2
		double[] d;
		d = new double[4];
		d[0] = 7;
		d[1] = d[0]*2;
		d[2]++;
		d[3] = -60;
		for (int i = 0; i < d.length; i++) {
			d[i] = Math.pow(d[i], 2);
		}
		System.out.println(Arrays.toString(d));
		System.out.println(search(d));
		System.out.println(sum(d));
	}
	//wyszukiwanie w tablicy	
	public static String search(double[] d) {
		String a = "znaleziono";
		String b = "nieznaleziono";
		for (int i = 0; i < d.length; i++) {
			if (d[i] == 3500.0) {
				return a;
			}
		}
		return b;
	}
	public static double sum(double[] d) {
		double total = 0.0;
		for (int i = 0; i < d.length; i++) {
			total += d [i];
		}
		return total;
	}
	
	// tablica z random liczbami
	public static int[] randomArray(int size) {
		Random random = new Random();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}
		return a;
	}
		
	public static void main(String[] args) {
		int[] counts;
		counts = new int[4];
		counts[0] = 7;
		counts[1] = counts[0]*2;
		counts[2]++;
		counts[3] = -60;
		for (int i = 0; i < 4; i++) {
			System.out.println(counts[i]);
		}
		printArray(counts);
		copy(counts);
		

		// randomowa tablica
		
		int numValues = 8;
		int[] array = randomArray(numValues);
		printArray(array);
		
		// zliczanie wystapienia danej wartosci w tablicy

		int a = inRange(array, 90, 100);
		int b = inRange(array, 80, 90);
		int c = inRange(array, 70, 80);
		int d = inRange(array, 60, 70);
		int e = inRange(array, 0, 60);
		
	
		System.out.println("Wyniki pomiêdzy 90 a 100 : " + a);
		System.out.println("Wyniki pomiêdzy 80 a 90 : " + b);
		System.out.println("Wyniki pomiêdzy 70 a 80 : " + c);
		System.out.println("Wyniki pomiêdzy 60 a 70 : " + d);
		System.out.println("Wyniki pomiêdzy 0 a 60 : " + e);

		int[] licz = new int[100];
		for (int i = 0; i < licz.length; i++) {
			licz[i] = inRange(array, i, i + 1);
		}
		
		// wyœwietlanie tablicy

		printArray(licz);
		
		// wyœwietlanie tablicy

		System.out.print("[" + licz[0]);
		for (int i = 1; i < licz.length; i++) {
			System.out.print("," + licz[i]);
		}
		System.out.println("]");
	}

	// liczenie wystepowania danego wyniku w tablicy
	
	public static int inRange(int[] a, int low, int high) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= low && a[i] < high) {
				count++;
			}
		}
		return count;
		
	}
	
		
}