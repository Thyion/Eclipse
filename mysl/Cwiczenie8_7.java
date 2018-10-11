public class Cwiczenie8_7 {
	public static void main(String[] args) {
		int n = 3;
		int[] y = new int[5];
		y[0] = 1;
		y[1] = 1;
		y[2] = 8;
		y[3] = 1;
		y[4] = 3;
		boolean d = areAllTrue(arePrimeFactors(n, y));
		System.out.println(d);
		if (d==true) {
			rat(y);
			System.out.println(rat(y));
			if (rat(y)==n) {
				System.out.println("hura hura sa liczby pierwsze i iloczyn ich to n");
			} else {
				System.out.println("dupa ... s¹ pierwsze ale ich iloczyn to nie n");
			}
		} else {
		System.out.println("dupa... nie s¹ pierwsze");
		}
		
	}
	
	 public static boolean areAllTrue(boolean[] arePrimeFactors) {
	
	    for(boolean b : arePrimeFactors) if(!b) return false;
		return true;
	    //pomonz wszystko z tablicy;
	 }

	public static int rat(int[] a) {
		int total = 1;
		for(int i = 0; i < a.length; i++) {
			total *= a[i];
		}
		return total;
	}
	


	public static boolean[] arePrimeFactors( int n, int[] array) {
		//daje true jesli pierwsze i iloczyn ich to n

		boolean[] era = new boolean[array.length];
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
	
		//System.out.println(Arrays.toString(era));
		
		
			
		return era;

	}
}