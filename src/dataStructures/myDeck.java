package dataStructures;

public abstract class myDeck {
	protected Card[] deck;
	
	public abstract void shuffle();
	
	public abstract void deal(int n);
}
