import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Deck {
	private Card[] cards;
	
	public Deck(int n) {
		this.cards = new Card[n];
	}
	
	public Deck() {
		this.cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1 ; rank <= 13; rank++) {
				this.cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}
	
	public void print() {
		for (int i = 0; i < this.cards.length; i++) {
			System.out.println(this.cards[i]);
		}
	}
	
	public int random(int low, int hight) {
		Random random = new Random();
		int a = random.nextInt(hight-low);
		return a;
	}
		
	public void shuffle() {
		Card[] a = new Card[1];
		Card[] b = new Card[1];
		for (int i = 0; i < this.cards.length; i++) {
			a[0] = this.cards[i];
			int y = random(i,this.cards.length);
			b[0] = this.cards[y];
			this.cards[i] = b[0];
			this.cards[y] = a[0];
		}
	}
	
	public void swapCards(int a, int b) {
		Card one = this.cards[a];
		Card two = this.cards[b];
		this.cards[a] = two;
		this.cards[b] = one;
		
	}
	
	public int indexLowest(int low, int high) {
		int index = low;
		for (int q = low; q <= high; q++ ) {
			if ((this.cards[q].compareTo(this.cards[index])) == 1 ) {
				index = q;
			} else {
				continue;
			}	
		}
		return index;
	}
	
	public void selectionSort() {
		for (int i = 0; i < this.cards.length; i++) {
			int x = this.indexLowest(i,51);
			this.swapCards(i, x);
		}
	}
	//public void selectionSort() {
	//	
	//	for (int i = 0; i < this.cards.length; i++) {
	//		this.indexLowest(i);
	//					
	//	}
	//}
	
	//public void indexLowest() {
	//	Card w;
		//Card u;
		//for (int q = 1; q <= 51; q++ ) {
			//if ((this.cards[q].compareTo(this.cards[0])) == 1 ) {
				//w = this.cards[q];
				//u = this.cards[0];
				//this.cards[q] = u;
				//this.cards[0] = w;
		//	}
	//		
	//	}
	//	
		
	//}
	
}
