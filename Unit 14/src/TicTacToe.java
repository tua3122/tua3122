//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

@SuppressWarnings("unused")
public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{


	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int count = 0;
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				mat[i][j]=game.charAt(count);
				count++;
			}
		}
	}

	public String getWinner()
	{
		for(int i = 0; i < mat.length; i++){
			if(mat[i][0]==mat[i][1]&&mat[i][0]==mat[i][2]){
				return mat[i][0] + " wins horizontally!";
			}
			if(mat[0][i]==mat[1][i]&&mat[0][i]==mat[2][i]){
				return mat[0][i] + " wins vertically!";
			}
		}
		if(mat[0][0]==mat[1][1]&&mat[0][0]==mat[2][2]){
			return mat[0][0] + " wins diagnonally!";
		}
		if(mat[0][2]==mat[1][1]&&mat[0][2]==mat[2][0]){
			return mat[0][2] + " wins diagnonally!";
		}
		return "cat's game - no winner!";
	}

	public String toString()
	{
		String output="";
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				output+=mat[i][j] +" ";
			}
			output+="\n";
		}
		return output+getWinner()+"\n\n";
	}
}