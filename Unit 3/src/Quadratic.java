//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{

	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		


	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c= quadC;

 	}

	public void calcRoots( )
	{
		double det = sqrt(b*b-4*a*c);
		
		rootOne = -1*b + det;
		rootOne = rootOne/(2*a);
		
		rootTwo = -1*b - det;
		rootTwo = rootTwo/(2*a);


	}

	public void print( )
	{
		System.out.print("rootone :: ");
		System.out.printf("%.2f\n", rootOne);
		System.out.print("roottwo :: ");
		System.out.printf("%.2f\n", rootTwo);


	}
}