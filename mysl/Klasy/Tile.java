public class Tile {
	private char letter;
	private int value;

	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}	
	
	public void printTile(Tile tile) {
		System.out.println("P�ytka ma liter� : " + tile.letter);
		System.out.println("Oraz warto�� punktow� : " + tile.value);
	}

	
}