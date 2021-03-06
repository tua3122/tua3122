//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{

	}


	public LetterRemover(String s, char rem)
	{
		setRemover(s, rem);
	}

	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int i = 0;
		while(i<=cleaned.length()-1){
			if(cleaned.charAt(i)==lookFor){
				cleaned = cleaned.replace(lookFor,' ');
			}
			i++;
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor +"\n" + removeLetters();
	}
}