/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		String[] rank1 = {"Ace", "Queen", "Jack"};
		String[] suit1 = {"Spades", "Hearts", "Diamonds"};
		int[] value1 = {1,12,11};
		Deck d1 = new Deck(rank1, suit1, value1);
		System.out.println("Deck 1 is empty: " + d1.isEmpty());
		
		String[] rank2 = {"Ace", "Queen", "Jack"};
		String[] suit2 = {"Spades", "Hearts", "Diamonds"};
		int[] value2 = {1,12,11};
		Deck d2 = new Deck(rank2, suit2, value2);
		System.out.println("Deck 2 is " + d2.size() + " cards.");
		
		String[] rank3 = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Queen", "Jack", "King"};
		String[] suit3 = {"Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades"};
		int[] value3 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck d3 = new Deck(rank3, suit3, value3);
		System.out.println("Dealt " + d3.deal() + " from Deck 3.");
	}
}
