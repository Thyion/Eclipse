public class PrintAmerica {
	public static void printAmerica(String day, int date, String month, int year) {
		System.out.println("Format amerykañski:");
		System.out.println(day + ", " + month + " " + date + ", " + year);
	}
	public static void main(String[] args) {
		String day = "pi¹tek";
		int date = 18;
		String month = "lipiec";
		int year = 1845;
		printAmerica(day, date, month, year);
	}
}