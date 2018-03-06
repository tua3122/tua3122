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

public class MadLib
{
	private ArrayList<String> verbs = new ArrayList<String>();
	private ArrayList<String> nouns = new ArrayList<String>();
	private ArrayList<String> adjectives = new ArrayList<String>();
	private String story = "";
	
	public MadLib()
	{
		



	}

	public MadLib(String fileName)
	{
		//load stuff
		loadNouns();
		loadVerbs();
		loadAdjectives();	
		//# = noun, @ = verb, & = adjective
		
		try{
			Scanner file = new Scanner(new File(fileName));
			String check = "";
			while(file.hasNext()){
				check = file.next();
				if(check.equals("#")){
					story+=getRandomNoun();
				}
				else if(check.equals("@")){
					story+=getRandomVerb();
				}
				else if(check.equals("&")){
					story+=getRandomAdjective();
				}
				else{
					story+=check;
				}
				story += " ";
			}
			file.close();
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
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
			Scanner file = new Scanner(new File("H:\\tua3122\\Unit 10\\src\\verbs.dat"));
			
			while(file.hasNextLine()){
				verbs.add(file.nextLine());
			}
			file.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("H:\\tua3122\\Unit 10\\src\\adjectives.dat"));
			
			while(file.hasNextLine()){
				adjectives.add(file.nextLine());
			}
			file.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public String getRandomVerb()
	{
		return verbs.get((int)(Math.random()*verbs.size()));
	}
	
	public String getRandomNoun()
	{
		
		return nouns.get((int)(Math.random()*nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		
		return adjectives.get((int)(Math.random()*adjectives.size()));
	}		

	public String toString()
	{
	   return story;
	}
}