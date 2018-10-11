
public class Main {
	public static void main(String args[]) {
		Punkt punkt = new Punkt();
		punkt.x = 5;
		punkt.y = 8;
		
		Test.zmien(punkt);
		System.out.println("Wspó³rzêdne to: " + punkt.x + "," + punkt.y);
		
	}
}
