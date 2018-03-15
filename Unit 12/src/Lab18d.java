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

@SuppressWarnings("unused")
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
		
		for(int i = 0; i < size-1; i++){
			Word lhs = new Word(strs[i]), rhs = new Word(strs[i+1]);
			if(lhs.compareTo(rhs)>0){
				tmp=strs[i+1];
				strs[i+1]=strs[i];
				strs[i]=tmp;
				i=0;
			}
			if(lhs.compareTo(rhs)==0 && strs[i].charAt(0)>strs[i+1].charAt(0)){
				tmp=strs[i+1];
				strs[i+1]=strs[i];
				strs[i]=tmp;
				i=0;
			}
		}
		
		for(int i = 0; i<size; i++){
			out.println(strs[i]);
		}
		file.close();
	}
}