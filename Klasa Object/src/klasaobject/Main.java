package klasaobject;

public class Main {
	public static void main(String[] args)
	{
		Punkt p = new Punkt(4,29);
		System.out.println(p.getClass());
		Punkt p2 = new Punkt(4,59);
		if (p.equals(p2)) {
			System.out.println("sa rowne");
		} else {
			System.out.println("nie sa rowne");
		}
		System.out.println(p);
		Punkt d = new Punkt(4, 4);
		
	}
}

class Punkt extends Object {
	
	private int x;
	private int y;
	
	public Punkt() {
		
	}
	/**
	 * Kontruktor
	 * @param x tworzy x
	 * @param y tworzy y
	 */
	Punkt(int x, int y) {
		this.x = x;
		this.y =y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
	@Override
	public boolean equals(Object o) {
		
		
		Punkt przyslany = (Punkt)o;
		if (this.x == przyslany.x && this.y == przyslany.y) {
			return true;
		} 
		return false;
		
		
	}
	@Override
	public String toString() {
		return getX() + " " + getY();
	}
	
	private static Punkt INSTANCE = null;
	
	public static Punkt getPunkt() {
		if(INSTANCE == null) {
			INSTANCE = new Punkt();
		}
		return INSTANCE;
		}
	
}