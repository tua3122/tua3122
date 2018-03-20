//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangle
{
	private int[][] mat;

	public PascalsTriangle()
	{
	}

	public PascalsTriangle(int size)
	{
		mat = new int[size][size];
		createTriangle();
	}

	public void createTriangle()
	{
		for(int i = 0; i < mat.length; i++){
			mat[i][0]=1;
			mat[i][i]=1;
		}
		for(int i = 1; i < mat.length; i++){
			for(int j = 1; j < mat.length; j++){
				if(mat[i][j]==0){
					mat[i][j]=mat[i-1][j-1]+mat[i-1][j];
				}
			}
		}
	}

	public String toString()
	{
		String output="";
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat.length; j++){
				if(mat[i][j]==0){
					output += "\t";
				}
				else{
					output += mat[i][j] + "\t";
				}
			}
			output += "\n";
		}
		output += "\n\n\n";
		return output;
	}
}