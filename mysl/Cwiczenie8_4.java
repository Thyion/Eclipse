import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Cwiczenie8_4 {
	
	public static int indexOfMax(int[] a) {
		int max = a[0];
	 	for(int i=1; i< a.length; i++)
                	{
                       	 if(a[i] > max)
                               	 max = a[i];                  
               	 }
	return max;
        }

	public static void main(String[] args) {
		int[] a = new int[8];
		a[0] = 5;
		a[1] = a[0];
		a[2] = 87;
		a[3] = a[0];
		a[4] = 23;
		a[5] = 34;
		a[6] = 84;
		a[7] = a[6];
	
	System.out.println(indexOfMax(a));
	}
}