
public class Card {
	private final int rank;
	private final int suit;
	
	public static final String[] RANKS = {null,"as","2","3","4","5","6","7","8","9","10","walet","dama","kr�l"};
	public static final String[] SUITS = {"trefl", "karo", "kier", "pik"};
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString() {
		return RANKS[this.rank] + " " +  SUITS[this.suit];
	}
	
	public int compareTo(Card that) {
		if (this.suit > that.suit) {
			return 1;
		}
		if (this.suit < that.suit) {
			return -1;
		}
		if (this.rank > that.rank) {
			return 1;
		}
		if (this.rank < that.rank) {
			return -1;
		}
		return 0;
	}
	
	public int getRank() {
		return this.rank;
	}
	public int getSuit() {
		return this.suit;
	}
	
	public void printDeck(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			System.out.println(cards[i]);
		}
	}
	
	public boolean equals(Card that) {
		return this.rank == that.rank && this.suit == that.suit;
	}
	
	public int search(Card[] cards, Card target) {
		for (int i = 0; i <cards.length; i++) {
			if (cards[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
}
