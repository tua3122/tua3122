//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		
	}

	public StringChecker(String s)
	{
		word = s;
	}

   public void setString(String s)
   {
   		word=s;
   }

	public boolean findLetter(char c)
	{
		if (word.indexOf(c)>-1){
			return true;
		}
		return false;
	}

	public boolean findSubString(String b)
	{
		if (word.indexOf(b)>-1){
			return true;
		}
		return false;
	}

 	public String toString(char a, String b, String c)
 	{
 		return "looking for " + a + " " + findLetter(a) + "\nlooking for " + b + " " + findSubString(b) + "\nlooking for " + c + " " + findSubString(c) +"\n" + word + "\n\n";
	}
}