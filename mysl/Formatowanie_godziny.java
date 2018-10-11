public class Formatowanie_godziny {

	public static void main(String[] args) {
		timeString(15,22);
		System.out.println(timeString(15,22));
	
	}
	
	public static String timeString(int hour, int minute) {
		String ampm;
		if (hour < 12) {
			ampm = "AM";
			if (hour == 0) {
				hour = 12;
			}
		} else {
			ampm = "PM";
			hour = hour - 12;
		}
	return String.format("%02d:%02d %s", hour, minute, ampm);
	}
	
}			