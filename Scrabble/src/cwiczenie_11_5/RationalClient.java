package cwiczenie_11_5;

public class RationalClient {
	
	public static void main(String[] args) {
		Rational fraction = new Rational(1,7);
		fraction.printRational();
		System.out.println(fraction);
		//fraction.negate();
		System.out.println(fraction);
		//fraction.invert();
		System.out.println(fraction);
		System.out.println(fraction.toDouble());
		System.out.println(fraction);
		System.out.println(fraction.reduce());
		System.out.println(fraction);
		Rational a = new Rational(2,4);
		System.out.println(fraction.add(a));
	}
	
	
}
