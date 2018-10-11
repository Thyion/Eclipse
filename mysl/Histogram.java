import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Histogram {

	public static void main(String[] args) {
		
		int numValues = 8;
		int[] array = randomArray(numValues);
		//printArray(array); - nie wiem czemu nie dziala
		//System.out.println(Arrays.toString(array));


		int[] scores = randomArray(20);

		int[] counts = new int[20];
		for (int i = 0; i < counts.length; i++) {
			counts[i] = inRange(scores, i, i +1);
		}

		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(counts));
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Wynik " + i + " wystapi³a " + inRange(scores, i, i + 1) + " razy.");
		}	
	}
	public static int[] randomArray(int size) {
		Random random = new Random();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(20);
		}
		return a;
	}

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

	