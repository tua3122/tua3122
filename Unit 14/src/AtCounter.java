//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

@SuppressWarnings("unused")
public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
							 {'@','@','@','-','@','@','-','@','-','@'},
							 {'-','-','-','-','-','-','-','@','@','@'},
							 {'-','@','@','@','@','@','-','@','-','@'},
							 {'-','@','-','@','-','@','-','@','-','@'},
							 {'@','@','@','@','@','@','-','@','@','@'},
							 {'-','@','-','@','-','@','-','-','-','@'},
							 {'-','@','@','@','-','@','-','-','-','-'},
							 {'-','@','-','@','-','@','-','@','@','@'},
							 {'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{		
		if(atMat[r][c]=='@'){
			atMat[r][c]='v';
			atCount++;
			if(r+2<atMat.length){
				countAts(r+1,c);}
			if(r-1>-1){
				countAts(r-1,c);
			}
			if(c+2<atMat.length){
				countAts(r,c+1);
			}
			if(c-1>-1){
				countAts(r,c-1);
			}			
		}
		return 0;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}