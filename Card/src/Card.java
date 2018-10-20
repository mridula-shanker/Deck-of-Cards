
public class Card 
{
	public static final int JACK = 11, QUEEN = 12, KING = 13, ACE = 1;
	public static final char CLUB = 'c', DIAMOND = 'd', HEART = 'h', SPADE = 's';
	
	//feilds
	private int value; //2-10
	private char suit; // black or red
	
	//constructers

	public Card (char suitInput, int valueInput)
	{
		suit = suitInput;
		value = valueInput;
	}
	
	//methods
	public int getValue()
	{
		return value;
	}
	
	public char getSuit()
	{
		return suit;
	}
	
	public Card setValue(int val) 
	{
		this.value = val;
		return this;
	}
	
	public Card setSuit(char suit) 
	{
		this.suit = suit;
		return this;
	}
	
	public String toString() 
	{
		return "Value" + value + "Suit" + suit;
	}
}

