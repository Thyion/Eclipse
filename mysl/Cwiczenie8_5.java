import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Cwiczenie8_5 {
public static boolean[] sieve(int[] array, int n) {

	boolean[] era = new boolean[n];
	for (int i = 0 ; i < era.length; i++) {
		if (array[i] == 1 || array[i] == 2 || array[i] == 3 || array[i] == 5 || array[i] == 7 || array[i] == 11 || array[i] == 13) {
			era[i] = true;
		} else {
			if (array[i] % 2 == 0) {
				era[i] = false;
			} else {
				if (array[i] % 3 == 0) {
					era[i] = false;
				} else {
					if (array[i] % 5 == 0) {
						era[i] = false;
					} else {
						if (array[i] % 7 == 0) {
							era[i] = false;
						} else {
							if (array[i] % 11 == 0) {
								era[i] = false;
							} else {
								if (array[i] % 13 == 0) {
									era[i] = false;
								} else {
								era[i] = true;
								}
							}
						}
					}
				}
			}
		}
	}
	
	System.out.println(Arrays.toString(era));
	return era;
}


public static int[] array(int n) {
	int[] a = new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i] = i;
	}
	System.out.println(Arrays.toString(a));
	return a;
}

public static void main(String[] args) {
	int n = 10;
	int[] a = array(n);
	sieve(a, n);
}
}