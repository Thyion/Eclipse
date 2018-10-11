import java.util.Arrays;

public class Cwiczenie9_2 {

	public static void main(String[] args) {
		String tekst = "DWupadupa";	
		
		System.out.println(Arrays.toString(letterHist(tekst)));
	}
	
	public static int[] letterHist(String tekst) {
		char[] alfabet_maly = new char[26];
		char[] alfabet_duzy = new char[26];
		char duza ='A';
		char mala = 'a';
		for (int a = 0; a < alfabet_duzy.length; a++) {
			alfabet_duzy[a] = duza;
			duza++;
		}
		System.out.println(Arrays.toString(alfabet_duzy));
		for (int b = 0; b < alfabet_maly.length; b++) {
			alfabet_maly[b] = mala;
			mala++;
		}
		System.out.println(Arrays.toString(alfabet_maly));
		int[] wystapienia = new int[26];
		for (int c = 0; c < wystapienia.length; c++) {
			wystapienia[c] = 0;
		}
		//System.out.println(Arrays.toString(wystapienia));
		for (int d = 0; d < tekst.length(); d++) {
			char letter = tekst.charAt(d);
			//System.out.println(letter);
		
			
				for (int x = 0; x < wystapienia.length; x++) {	
					if (letter == alfabet_maly[x] || letter == alfabet_duzy[x]) {
						wystapienia[x]++;
					}
				}
				
		}
		return wystapienia;
	}
}
		
		
	



	
			