//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.*;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound, i = 0, guess = -1;
	private double correct;
	private float percent = 0.00f;

	public GuessingGame(int stop)
	{


	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		out.print("Guessing game - how many numbers? ");
		upperBound = keyboard.nextInt();
		correct = rand.nextInt(upperBound);
		//correct = (Math.random() * (upperBound-1)+1);
		//correct = correct - correct%1;
		while(guess != correct){
			out.print("Enter a number between 1 and " + upperBound + " ");
			guess = keyboard.nextInt();
			if((guess>upperBound)||(guess<1)){
				out.println("Number out of range!");
			}
			else{
				i++;
				percent++;
			}
			
		}
		percent = (percent-1)/percent;
		percent = percent *100;
		
	}

	public String toString()
	{
		String output="\nIt took " + i + " guesses to guess " + correct +".\nYou guessed wrong "+ percent + "% of the time.\n\nDo you want to play again? ";
		return output;
	}
}