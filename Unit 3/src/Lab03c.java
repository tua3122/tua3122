//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
		Scanner keyboard = new Scanner(System.in);
		Quadratic lab = new Quadratic();
		System.out.print("Enter a :: ");
		int a = keyboard.nextInt();
		System.out.print("Enter b :: ");
		int b = keyboard.nextInt();
		System.out.print("Enter c :: ");
		int c = keyboard.nextInt();
		System.out.println();
		keyboard.close();
		
		lab.setEquation(a,b,c);
		lab.calcRoots();
		lab.print(); 	
	}
}