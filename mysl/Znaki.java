public class Znaki {
	public static void main(String[] args) {

		String word = "dupka";
		int length = word.length();
		char last = word.charAt(length - 1);
		System.out.println(last);
	//pod³añcuch
		System.out.println(word.substring(3));
	
	//wyszukiwanie wystapieñ metoda indexOf
		String fruit = "pomarañcza";
		int index = fruit.indexOf('ñ');
		int index2 = fruit.indexOf('a',6);
		System.out.println(index);
		System.out.println(index2);
	
	}
}