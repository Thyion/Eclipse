public class Compare {
	public static void main(String[] args) {
		String name1 = "Malwina Ma�kowska";
		String name2 = "Krzysztof Beszczy�ski";
		if (name1.equals(name2)) {
			System.out.println("Nazwiska s� takie same");
		} else {
		System.out.println("Nazwiska s� inne");
		}

		int diff = name1.compareTo(name2);
		if(diff==0){
			System.out.println("Nazwiska s� takie same");
		} else if (diff<0) {
			System.out.println("R�nica to " + diff + " i " + name1 + " wyst�puje przed " + name2);
		} else if (diff>0) {
			System.out.println("R�nica to " + diff + " i " + name2 + " wyst�puje przed " + name1);
		}
	}
}