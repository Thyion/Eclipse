package my;

public class TileClient {
	public static void main(String[] args) {
		testTile('Z',12);
	}
	
	public static void testTile(char letter, int value) {
		Tile tile = new Tile(letter,value);
		tile.printTile(tile);
		
	}
}
