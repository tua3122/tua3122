//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response='y';
		
		GuessingGame lab = new GuessingGame(1);
		
		while(response == 'y'){
			lab.playGame();
			out.println(lab);
			response = keyboard.next().charAt(0);
		}
		keyboard.close();
	}
}