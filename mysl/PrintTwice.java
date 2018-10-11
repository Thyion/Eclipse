public class PrintTwice {
	
	public static void printTwice(String s) {
		System.out.println(s);
		System.out.println(s);
	}
	
	public static void printTime(int hour, int minute) {
		System.out.print(hour+1);
		System.out.print(":");
		System.out.println(minute);
	}
	
	public static void main(String[] args) {
		String argument = "Mam Ciê w dupie.";
		printTwice(argument);
		int hour = 11;
		int minute = 59;
		printTime(hour, minute);
		System.out.println(hour);
	}
}