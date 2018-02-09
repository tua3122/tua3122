//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Distance lab = new Distance();
		
		System.out.print("Enter X1 :: ");
		int a = keyboard.nextInt();
		System.out.print("Enter Y1 :: ");
		int b = keyboard.nextInt();
		System.out.print("Enter X2 :: ");
		int c = keyboard.nextInt();
		System.out.print("Enter y2 :: ");
		int d = keyboard.nextInt();
		keyboard.close();
		
		lab.setCoordinates(a, b, c, d);
		lab.calcDistance();
		lab.print();
	}
}