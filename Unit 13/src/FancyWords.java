//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;
/*Takes last character of each word.
 * 
 */
public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		setWords(sentence);
	}

	public void setWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < wordRay.length; i++){
			if(wordRay[i].length()>max){
				max = wordRay[i].length();
			}
		}
		for(int i = max; i>0; i--){
			for(int j = wordRay.length-1; j>=0; j--){
				if(wordRay[j].charAt(i)==-1){
					output += " ";
				}
				else{
					output += wordRay[j].charAt(i);
				}
			}
		}
		output = "pls";
		return output+"\n\n";
	}
}