
public class Company {
	
	public static void main(String args[]) {
		Pracownik prac = new Pracownik("W�odek", "Zi�ba",3000);
		System.out.println("Imi�: " + prac.name);
		System.out.println("Nazwisko: " + prac.surname);
		System.out.println("Wyp�ata: " + prac.wyplata + "\n");
		
		Boss szef = new Boss();
		System.out.println("Imi�: " + szef.name);
		System.out.println("Nazwisko: " + szef.surname);
		System.out.println("Wyp�ata: " + szef.wyplata);
		System.out.println("Premia: " + szef.premia + "\n");
	
		szef.name = "Krzysztof";
		szef.surname = "Beszczy�ski";
		szef.wyplata = 8200;
		szef.premia = 4000;
		System.out.println("Imi�: " + szef.name);
		System.out.println("Nazwisko: " + szef.surname);
		System.out.println("Wyp�ata: " + szef.wyplata);
		System.out.println("Premia: " + szef.premia + "\n");
	
	}
}
