public class Compare {
	public static void main(String[] args) {
		String name1 = "Malwina Mañkowska";
		String name2 = "Krzysztof Beszczyñski";
		if (name1.equals(name2)) {
			System.out.println("Nazwiska s¹ takie same");
		} else {
		System.out.println("Nazwiska s¹ inne");
		}

		int diff = name1.compareTo(name2);
		if(diff==0){
			System.out.println("Nazwiska s¹ takie same");
		} else if (diff<0) {
			System.out.println("Ró¿nica to " + diff + " i " + name1 + " wystêpuje przed " + name2);
		} else if (diff>0) {
			System.out.println("Ró¿nica to " + diff + " i " + name2 + " wystêpuje przed " + name1);
		}
	}
}