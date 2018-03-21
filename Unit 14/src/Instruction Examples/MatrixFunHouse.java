//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

@SuppressWarnings("unused")
public class MatrixFunHouse
{
	private int[][] mat;

	public MatrixFunHouse()
	{

	}

	public MatrixFunHouse(int numRows, int numCols)
	{
		setSize(numRows, numCols);
	}
	
   public void setSize(int numRows, int numCols)
   {
	   mat = new int[numRows][numCols];
   }	

	public void setSpot(int row, int col, int val)
	{
		mat[row][col] = val;
	}
	
   public int getRowTotal(int row)
   {
   	int total=0;
   	for(int i = 0; i<mat.length; i++){
   		total += mat[row][i];
   	}
	return total;
   }

	public int getTotal()
	{
		int total=0;
		for(int i = 0; i<mat[0].length; i++){
	   		total += getRowTotal(i);}
		return total;
	}

	public String toString()
	{
		String output="";
		for(int r=0; r<mat.length; r++)
		{
			for(int c=0; c<mat[r].length; c++)
			{
				output+=" "+mat[r][c];
			}
			output+="\n";
		}
		return output;
	}
}