//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

@SuppressWarnings("unused")
public class WordE implements Comparable<WordE>
{
	private String word;

	public WordE( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(int i = 0; i < word.length(); i++){
			for(int j = 0; j<vowels.length(); j++){
				if(word.charAt(i)==vowels.charAt(j)){
					vowelCount++;
				}
			}
		}
		return vowelCount;
	}

	public int compareTo(WordE rhs)
	{
		if(numVowels() > rhs.numVowels()){
			return 1;
		}
		
		if(numVowels() == rhs.numVowels()){
			return 0;
		}
	
		return -1;
	}

	public String toString()
	{
		return word;
	}
}