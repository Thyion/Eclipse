public class Znaki {
	public static void main(String[] args) {

		String word = "dupka";
		int length = word.length();
		char last = word.charAt(length - 1);
		System.out.println(last);
	//pod�a�cuch
		System.out.println(word.substring(3));
	
	//wyszukiwanie wystapie� metoda indexOf
		String fruit = "pomara�cza";
		int index = fruit.indexOf('�');
		int index2 = fruit.indexOf('a',6);
		System.out.println(index);
		System.out.println(index2);
	
	}
}