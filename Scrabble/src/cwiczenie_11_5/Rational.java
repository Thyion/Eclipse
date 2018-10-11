package cwiczenie_11_5;

public class Rational {
	private int nominator;
	private int denominator;
	
	public Rational() {
		nominator = 0;
		denominator = 1;
	}

	public Rational(int nominator, int denominator) {
		this.nominator = nominator;
		this.denominator = denominator;
	}
	
	public void printRational() {
		System.out.println("U³amek : " + this.nominator + "/" + this.denominator);
		
	}
	
	public String toString() {
		return String.format("%s : %01d/%01d\n", "U³amek", this.nominator, this.denominator);
	}
	
	public void negate() {
		this.nominator = this.nominator * -1;
		
	}
	
	public void invert() {
		int X = this.nominator * -1;
		this.nominator = this.denominator * -1;
		this.denominator = X;
	}
	
	public double toDouble() {
		double toDouble = (double) this.nominator / (double) this.denominator;
		return toDouble;
	}
	
	public int reduce () {
		int a = this.nominator;
		int b = this.denominator;
		while (a != b) {
			if(a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
	
	public Rational add(Rational a) {
		Rational b = new Rational();
		System.out.println(this.nominator);
		System.out.println(this.denominator);
		System.out.println(a.nominator);
		System.out.println(a.denominator);
		b.nominator = ((a.nominator * this.denominator) + (this.nominator * a.denominator));
		b.denominator = a.denominator * this.denominator;
		while (b.reduce() != 1) {
			int c = b.reduce();
			b.nominator = b.nominator / c;
			b.denominator = b.denominator / c;
			b.reduce();
		} 
		if (b.reduce() == 1) {
			return b;
		}
	return b;
	}
		
}

