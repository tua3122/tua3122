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
		String output=" ";
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < wordRay.length; i++){
			for(int j=0; j < max; j++){
				output+=wordRay[i].charAt(0);
				if(wordRay[i].charAt(j)!=-1){
					
				}
			}
			
			/*if(wordRay[i].length()>max){
				max = wordRay[i].length();
			}*/
		}
		//output+=wordRay[0].charAt(0);
		/*for(int i = 1; i<=max;i++){
			for(int j = 1; j<=wordRay.length; j++){
				output+=wordRay[wordRay.length-j].charAt(max-i);
			}
		}
		for(int i = 1; i<=max;i++){
			for(int j = 1; j<=wordRay.length; j++){
				output+=wordRay[j].charAt(i);
			}
		}
		
		for(int i = max; i>0; i--){
			for(int j = wordRay.length-1; j>=0; j--){
				output += wordRay[j].charAt(i-1);
				if(wordRay[j].charAt(i)==-1){
					output += " ";
				}
				else{
					output += wordRay[j].charAt(i-1);
				}
			}
		}
		output = "pls";
		return output+"\n\n";*/
		System.out.println(output);
		return output+"\n";
	}
}