public class Time {
	public static void main(String[] args) {
		double hour = 17.0;
		double minute = 5.0;
		double second = 32.0;
		//liczba senkund od p�nocy LSOP		
		double LSOP = (hour*3600+minute*60+second);
		//komunikat LSOP
		String KLSOP = (LSOP+" - liczba sekund kt�ra min�a od p�nocy!");
		System.out.println (KLSOP);
		//liczba sekund ca�ego dnia		
		double LSCD = (24*3600);
		//liczbaa sekund do ko�ca dnia
		double LSDKD = (LSCD-LSOP);
		String KLSDKD = (LSDKD+" - liczba sekund do ko�ca dnia");
		System.out.println (KLSDKD);
		// Odsetek dnia
		System.out.print ("Odsedek dnia kt�ry up�yn��: ");
		System.out.println (LSOP*100/LSCD+"%");
		// Odsetek dnia zaokraglony niedzia�a
		//double OD = (LSOP*100/LSCD);
		//double ODZ = OD.substring(0,3);
		//System.out.println (ODZ);
		
		//obliczanie czasu od poczatku do konca
		int LSOP2 = (17*3600+5*60+32); 
		int hour2 = 19;
		int minute2 = 7;
		int second2 = 38;
		int LSOPN = (hour2*3600+minute2*60+second2);
		int CZAS = (LSOPN-LSOP2); //sekundy ile trwa�o
		int godzina = (CZAS/3600);
		int minuta = ((CZAS-godzina*3600)/60);
		int sekunda = (CZAS-godzina*3600-minuta*60);
		System.out.print ("Czas kt�ry pracowa�em nad tym: ");
		System.out.println (godzina+" Godz."+" , "+minuta+" Min."+" , "+sekunda+" Sec.");
		
	}
}
	