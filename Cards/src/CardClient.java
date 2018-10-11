public class CardClient {
	public static void main(String[] args) {
		Card card = new Card(11,2);
		Card card2 = new Card(9,2);
		System.out.println(card);
		System.out.println(card2);
		System.out.println(card.compareTo(card2));
		
		
		Card[] cards = new Card[52];
		
		if (cards[0] == null) {
			System.out.println("Nie ma jeszcze ¿adnych kart!");
		}	
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
		card.printDeck(cards);
		
		System.out.println(card.search(cards, card));
		
		Deck deck = new Deck();
		deck.print();
		deck.shuffle();
		deck.print();
		System.out.println("SORTUJEMY");
		deck.selectionSort();
		deck.print();
	}
}
