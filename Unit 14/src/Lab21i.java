//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\tua3122\\Unit 14\\src\\lab21i.dat"));
		while(file.hasNextLine()){
			int count = file.nextInt();
			file.nextLine();
			String maze = file.nextLine();
			Maze x = new Maze(count, maze);
			out.println(x +"\n");
		}
		file.close();
	}
}