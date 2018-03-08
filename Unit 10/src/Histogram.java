//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{

	}

	public Histogram(char[] values, String fName)
	{
		fileName=fName;
		letters = new ArrayList<Character>();
		for(int i = 0; i<values.length; i++){
			letters.add(values[i]);
		}
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		count = new ArrayList<Integer>();
		String line;
		try{
			Scanner file = new Scanner(new File("H:\\tua3122\\Unit 10\\src\\"+fileName));
			
			count = new ArrayList<Integer>();
			for(int i = 0; i<letters.size(); i++){
				count.add(0);
			}
			
			int num = file.nextInt();
			for(int i = 0; i<=num; i++){
				line = file.nextLine();
				for(int j = 0; j<line.length(); j++){
					for(int k =0; k<letters.size(); k++){
						if(letters.get(k) == line.charAt(j)){//or.equals
							count.set(k, count.get(k)+1);
						}
					}
				}
			}
			file.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	

	}

	public char mostFrequent()
	{
		int most = 0, index = 0;
		for(int i = 0; i < count.size(); i++){
			if (count.get(i)>most){
				most = count.get(i);
				index = i;
			}
		}
		return letters.get(index);
	}

	public char leastFrequent()
	{
		int least = 100, index = 0;
		for(int i = 0; i < count.size(); i++){
			if (count.get(i)<least){
				least = count.get(i);
				index = i;
			}
		}
		return letters.get(index);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}