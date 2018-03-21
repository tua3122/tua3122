//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

@SuppressWarnings("unused")
public class FancyWordTwo
{
	private char[][] mat;

	public FancyWordTwo()
	{

	}

   public FancyWordTwo(String s)
	{
	   mat = new char[s.length()][s.length()];
	   for(int i = 0; i < s.length(); i++){
		   mat[0][i]=s.charAt(i);
		   mat[i][0]=s.charAt(i);
		   mat[mat.length-1][mat.length-1-i]=s.charAt(i);
		   mat[mat.length-1-i][mat.length-1]=s.charAt(i);
	   }
	}

	public String toString()
	{
		String output="";
		
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j<mat.length; j++){
				output+=""+mat[i][j];
			}
			output += "\n";
		}
		
		return output+"\n\n";
	}
}