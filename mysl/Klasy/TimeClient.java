public class TimeClient {
	
	public static void main(String[] args) {
		Time tame = new Time(9,42,2);
		System.out.println(tame.getHour());
		tame.setMinute(85);
		System.out.println(tame.getMinute());	
		tame.printTime(tame);
		System.out.println(tame);
	}
	
	
}