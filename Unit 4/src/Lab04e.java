//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab04e
{
	public static void main ( String[] args )
	{
		StringChecker demo = new StringChecker("chicken");
		System.out.println(demo.toString('c',"ch","x"));

		demo = new StringChecker("alligator");
		System.out.println(demo.toString('g',"all","gater"));

		demo = new StringChecker("COMPUTER SCIENCE IS THE BEST!");
		System.out.println(demo.toString('U',"COMP SCI","SCIENCE"));
	}
}