//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

public class Lab08i
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		int num = keyboard.nextInt();
		Prime lab = new Prime(num);
		System.out.print(lab);
		
		keyboard.close();		
	}	
}