//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\tua3122\\Unit 14\\src\\lab24e.dat"));
		int count = file.nextInt();
		file.nextLine();
		for(int i = 0; i < count; i++){
			FancyWordTwo x = new FancyWordTwo(file.nextLine());
			out.print(x);
		}
		file.close();
	}
}