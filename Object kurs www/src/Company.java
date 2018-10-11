
public class Company {
	
	public static void main(String args[]) {
		Pracownik prac = new Pracownik("W³odek", "Ziêba",3000);
		System.out.println("Imiê: " + prac.name);
		System.out.println("Nazwisko: " + prac.surname);
		System.out.println("Wyp³ata: " + prac.wyplata + "\n");
		
		Boss szef = new Boss();
		System.out.println("Imiê: " + szef.name);
		System.out.println("Nazwisko: " + szef.surname);
		System.out.println("Wyp³ata: " + szef.wyplata);
		System.out.println("Premia: " + szef.premia + "\n");
	
		szef.name = "Krzysztof";
		szef.surname = "Beszczyñski";
		szef.wyplata = 8200;
		szef.premia = 4000;
		System.out.println("Imiê: " + szef.name);
		System.out.println("Nazwisko: " + szef.surname);
		System.out.println("Wyp³ata: " + szef.wyplata);
		System.out.println("Premia: " + szef.premia + "\n");
	
	}
}
