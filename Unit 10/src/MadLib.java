//� A+ Computer Science  -  www.apluscompsci.com
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

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		



	}

	public MadLib(String fileName)
	{
		//load stuff
		loadNouns();
		/*for(int i = 0; i < nouns.size(); i++){
			System.out.println(nouns.get(i));
		}*/
		
		
		/*try{
			Scanner file = new Scanner(new File(fileName));
		
		
		
		
		
		
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}*/
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("H:\\tua3122\\Unit 10\\src\\nouns.dat"));
			
			while(file.hasNextLine()){
				nouns.add(file.nextLine());
			}
			file.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
	
	
	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
	
	
	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
	
		return "";
	}
	
	public String getRandomNoun()
	{
		
		return "";
	}
	
	public String getRandomAdjective()
	{
		
		return "";
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}