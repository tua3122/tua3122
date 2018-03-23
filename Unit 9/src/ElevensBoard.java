import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
@SuppressWarnings("unused")
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */

	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 	System.out.println("Allen Tu, 1, 3/23/2018, CA-SU-F101-12");
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/*Removed 
		 * if(selectedCards.size()==2){
			return containsPairSum11(selectedCards);
		}*/
		
		/*if(selectedCards.size()==2){
			return containsJQK(selectedCards);
		}*/
		if(selectedCards.size()==2){
			return contains2Heads(selectedCards);
		}
		if(selectedCards.size()==3){
			return containsPairSum11(selectedCards);
		}
		return false;
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		return (containsPairSum11(cardIndexes())||contains2Heads(cardIndexes()));
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	/*//2 cards
	 * private boolean containsPairSum11(List<Integer> selectedCards) {
		for(int i = 0; i < selectedCards.size(); i++){
			for(int j = i+1; j < selectedCards.size(); j++){
				if(cardAt(selectedCards.get(i)).pointValue()+cardAt(selectedCards.get(j)).pointValue()==11){
					return true;
				}
			}
		}
		return false;
	}*/
	//3 cards
	private boolean containsPairSum11(List<Integer> selectedCards) {
		for(int i = 0; i < selectedCards.size(); i++){
			for(int j = i+1; j < selectedCards.size(); j++){
				for(int k = j+1; k < selectedCards.size(); k++){
					if(cardAt(selectedCards.get(i)).pointValue()+cardAt(selectedCards.get(j)).pointValue()+cardAt(selectedCards.get(k)).pointValue()==11){
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	/*private boolean containsJQK(List<Integer> selectedCards) {
		boolean jack = false, queen = false, king = false;
		for(int i = 0; i < selectedCards.size(); i++){
			if(cardAt(selectedCards.get(i)).rank()=="jack"){
				jack = true;
			}
			if(cardAt(selectedCards.get(i)).rank()=="queen"){
				queen = true;
			}
			if(cardAt(selectedCards.get(i)).rank()=="king"){
				king = true;
			}
		}
		if( jack && queen && king){
			return true;
		}
		return false;
	}*/
	
	private boolean contains2Heads(List<Integer> selectedCards) {
		for(int i = 0; i < selectedCards.size(); i++){
			for(int j = i+1; j < selectedCards.size(); j++){
				if(cardAt(selectedCards.get(i)).rank()==cardAt(selectedCards.get(j)).rank()){
					if(cardAt(selectedCards.get(i)).rank()=="jack" || cardAt(selectedCards.get(i)).rank()=="queen" || cardAt(selectedCards.get(i)).rank()=="king"){ 
						return true;
					}
				}
			}
		}
		return false;
	}
}
