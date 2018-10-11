public class Cwiczenie4_2 {
	public static void zool(int hour, String pet, String street) {
		System.out.println(hour + " , " + pet + " , " + street);
	}
	
	public static void main(String[] arg) {
		int hour = 11;
		String pet = "Cezar";
		String street = "3 - Maja";
		zool(hour, pet, street);
	}
}