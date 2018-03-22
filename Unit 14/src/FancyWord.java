//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

@SuppressWarnings("unused")
public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{

	}

   public FancyWord(String s)
	{
	   Scanner x = new Scanner(s);
	   mat = new char[s.length()][s.length()];
	   for(int i = 0; i<s.length();i++){
		   mat[i][i]+=s.charAt(i);
		   mat[i][s.length()-1-i]=s.charAt(i);
		   mat[0][i]=s.charAt(i);
		   mat[s.length()-1][i]=s.charAt(i);
	   }
	   x.close();
	}

	public String toString()
	{
		String output="";
		for(int i = 0; i<mat.length;i++){
			for(int j = 0; j<mat[0].length; j++){
				output+=mat[i][j];
			}
			output+="\n";
		}





		return output+"\n\n";
	}
}