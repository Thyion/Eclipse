public class Piwo {
	public static void piwo(int n) {
		if (n == 0) {
			System.out.println("Nie ma butelek piwa na regale,\nnie ma butelek piwa,");
			System.out.println("nie mo¿esz wzi¹æ ani jednej, nie mo¿esz jej podaæ dalej,\nbo nie ma ju¿ wiêcej butelek piwa na regale!");
		} else {
			System.out.println(n + " butelek piwa na regale,");
			System.out.println(n +" butelek piwa,");
			System.out.println("weŸ jedn¹, podaj j¹ dalej,");
			System.out.println(n + " butelek piwa na regale.");
			System.out.println();
			piwo(n-1);
		}
	}
	public static void main(String[] args) {
		int n = 99;
		piwo(n);
	}

}