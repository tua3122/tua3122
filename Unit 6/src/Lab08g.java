//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab08g
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		keyboard.close();
		
		LoopStats lab = new LoopStats(a,b);
		out.println(lab);					
	}
}