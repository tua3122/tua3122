//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\tua3122\\Unit 12\\src\\lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		String[] strs = new String[size];
		String tmp;
		
		for(int i =0; i<size; i++){
			strs[i]=file.next();
		}
		WordD lhs;
		for(int i = 0; i<size; i++){
			lhs = new WordD(strs[i]);
			for(int j = 0; j<strs.length-1; j++){
				if (strs[i].length()>strs[j+1].length()){
					tmp=strs[j+1];
					strs[j+1]=strs[i];
					strs[i]=tmp;
				}
			}
		}
		
		for(int i = 0; i<size; i++){
			out.println(strs[i]);
		}
		file.close();
	}
}