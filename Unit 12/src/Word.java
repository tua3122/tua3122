//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

@SuppressWarnings("unused")
public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{
		if(word.length()>rhs.word.length()){
			return 1;
		}
		if(word.length()<rhs.word.length()){
			return -1;
		}
		return 0;
	}

	public String toString()
	{
		return "";
	}
}