
public class Pracownik {
	String name;
	String surname;
	int wyplata;
	
	public Pracownik() {
		name = "";
		surname = "";
		wyplata = 0;
	}
	
	public Pracownik(String i, String n, int w) {
		name = i;
		surname = n;
		wyplata = w;
	}
}
