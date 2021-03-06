/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card Card1 = new Card("Ace", "Spades", 1);
		Card Card2 = new Card("Queen", "Hearts", 12);
		Card Card3 = new Card("Queen", "Hearts", 12);
		
		System.out.println(Card1.toString());
		System.out.println(Card2.toString());
		System.out.println(Card3.toString());
		
		System.out.println("Card 1 and Card 2 are equal: " + Card1.matches(Card2));
		System.out.println("Card 2 and Card 3 are equal: " + Card2.matches(Card3));
	}
}
