//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		try{
			Scanner file = new Scanner(new File("H:\\tua3122\\Unit 13\\src\\lab15d.dat"));
			int count = file.nextInt();
			file.nextLine();
			FancyWords s;
			
			for(int i = 0; i < count; i++){
				s = new FancyWords(file.nextLine());
				System.out.print(s);
			}
			file.close();
		}
		catch(Exception e){}

	}
}