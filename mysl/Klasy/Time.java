public class Time {
	private int hour;
	private int minute;
	private double second;

	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0.0;
	}

	public Time(int hour, int minute, double second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return this.hour;
	}
	public int getMinute() {
		return this.minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}

	public Time printTime(Time t) {
		System.out.print(t.hour);
		System.out.print(":");
		System.out.print(t.minute);
		System.out.print(":");
		System.out.println(t.second);
	return t;
	}

	public String toString() {
		return String.format("%02d:%02d:%04.1f\n", this.hour, this.minute, this.second);
	}

}