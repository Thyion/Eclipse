public class test{
	public static void main(String[] args){
		String hello = "Witaj ";
		String world = "�wiecie!";
		String powitanie = hello+world; //�aczenie string�w
		System.out.println(powitanie);
		final char finalna0;
		finalna0 = 'Q';
	
		String czesc = powitanie.substring(0,6)+"uczniu"+finalna0;
		System.out.println(czesc);
	}
}