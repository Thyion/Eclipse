import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj wyraz który jest palindromem...");
		String pali;
		pali = in.nextLine();
		if(palindrom(pali)) {
		System.out.println("Wyraz jest palindromem !!!!");
		} else {
		System.out.println("Wyraz nie jest palindromem !!!!");
		}
	}
	
	public static boolean palindrom(String word) {
		int length = word.length();
		if(length == 1) {
			return true;
		} else if(length == 2) {
				if(word.charAt(0) == word.charAt(1)) {
					return true;
				} else {
					return false;
				}
			}
		else if(length == 3) {
				if(word.charAt(0) == word.charAt(2)) {
					return true;
				} else {
					return false;
				}
			}
		 else if(word.length() > 3) {
				if(word.charAt(0) == word.charAt((length-1))) {
					String dupa = word.substring(1, length - 1);
					return palindrom(dupa);
				} else {	
					return false;
				}
			}
		return palindrom(word);
	}	
	
}