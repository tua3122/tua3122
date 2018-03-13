//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordD implements Comparable<WordD>
{
	private String word;

	public WordD( String s )
	{
		word = s;
	}

	public int compareTo( WordD rhs )
	{
		WordD com = (WordD)rhs;
		if(word.length()>com.word.length()){
			return 1;
		}
		if(word.length()<com.word.length()){
			return -1;
		}
		return 0;
	}

	public String toString()
	{
		return "";
	}
}