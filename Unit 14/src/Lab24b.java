//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File ("H:\\tua3122\\Unit 14\\src\\lab24b.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++)
		{
			FancyWord word = new FancyWord(file.next());
			out.print(word);
	   }
		file.close();
	}
}