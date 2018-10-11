public class Time {
	public static void main(String[] args) {
		double hour = 17.0;
		double minute = 5.0;
		double second = 32.0;
		//liczba senkund od pó³nocy LSOP		
		double LSOP = (hour*3600+minute*60+second);
		//komunikat LSOP
		String KLSOP = (LSOP+" - liczba sekund która minê³a od pó³nocy!");
		System.out.println (KLSOP);
		//liczba sekund ca³ego dnia		
		double LSCD = (24*3600);
		//liczbaa sekund do koñca dnia
		double LSDKD = (LSCD-LSOP);
		String KLSDKD = (LSDKD+" - liczba sekund do koñca dnia");
		System.out.println (KLSDKD);
		// Odsetek dnia
		System.out.print ("Odsedek dnia który up³yn¹³: ");
		System.out.println (LSOP*100/LSCD+"%");
		// Odsetek dnia zaokraglony niedzia³a
		//double OD = (LSOP*100/LSCD);
		//double ODZ = OD.substring(0,3);
		//System.out.println (ODZ);
		
		//obliczanie czasu od poczatku do konca
		int LSOP2 = (17*3600+5*60+32); 
		int hour2 = 19;
		int minute2 = 7;
		int second2 = 38;
		int LSOPN = (hour2*3600+minute2*60+second2);
		int CZAS = (LSOPN-LSOP2); //sekundy ile trwa³o
		int godzina = (CZAS/3600);
		int minuta = ((CZAS-godzina*3600)/60);
		int sekunda = (CZAS-godzina*3600-minuta*60);
		System.out.print ("Czas który pracowa³em nad tym: ");
		System.out.println (godzina+" Godz."+" , "+minuta+" Min."+" , "+sekunda+" Sec.");
		
	}
}
	