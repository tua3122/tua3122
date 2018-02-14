//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let,count);
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		for(int i = 0; i<=size; i++){
			for(int x = size-1; x>=i;x--){
				output = output + " ";
			}
			for(int x = 0; x<=i; x++){
				output = output + getLetter();
			}
			output = output + "\n";
		}
		
		return output;
	}
}