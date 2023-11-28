package dataStructures;

public class Card {
	
	int value;
	String suit;
	
	public Card(int n, String s){
		value = n;
		suit = s;
	}
	
	
	public void print() {
		if(value == 0)
			System.out.println("Ace of" + suit);
		else if(value == 11)
			System.out.println("Jack of" + suit);
		else if(value == 12)
			System.out.println("Queen of" + suit);
		else if(value == 13)
			System.out.println("King of" + suit);
		else
			System.out.println(value + " of " + suit);
	}

}
