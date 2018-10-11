import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Cwiczenie8_6 {

	public static void main(String[] args) {
		int n = 10;
		int[] y = array(n);
		boolean d = areAllTrue(areFactors(n, y));
		System.out.println(d);
	}
	
	 public static boolean areAllTrue(boolean[] areFactors)
	 {
	    for(boolean b : areFactors) if(!b) return false;
	    return true;
	 }

	public static boolean[] areFactors(int n, int[] a) {
	boolean[] areFactors = new boolean[a.length];
		
		for(int i = 0;i < a.length;i++) {
			if(n % a[i] == 0) {
				areFactors[i] = true;
			} else {
				areFactors[i] = false;
			}
		}
		return areFactors;
	}
	public static int[] array(int n) {
		int[] a = new int[4];
		a[0] = 2;
		a[1] = 2;
		a[2] = 2;
		a[3] = 10;

		return a;
	}
}

// DZIA£A gdy nie ma tablicy na boolean[] areFactors >>> boolean isAllTrue = Arrays.asList(myArray).stream().allMatch(val -> val == true);



// return Booleans.contains(myArray, true);

// for (i = 0; i < myArray.length; i++) {
//   if (!myArray[i]) return false;
// }
// return true;



// Arrays.asList(myArray).contains(false)



// public static boolean areAllTrue(boolean[] array)
// {
//    for(boolean b : array) if(!b) return false;
//     return true;
// }

