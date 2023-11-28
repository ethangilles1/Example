package dataStructures;

public abstract class myDeck {
	protected Card[] deck;
	
	public myDeck() {
		deck = new Card[52];
		int index = 0;
		for(int i = 1; i <= 4; i++) {
			String s = switch(i) {
				case 1 -> "Clubs";
				case 2 -> "Spades";
				case 3 -> "Hearts";
				case 4 -> "Diamonds";
				default -> null;
			};
			
			for(int j = 0; j <= 13; j++) {
				deck[index] = new Card(j, s);
				index++;
			}
		}
	}
	
	public abstract void shuffle();
	
	public abstract void deal(int n);
}
