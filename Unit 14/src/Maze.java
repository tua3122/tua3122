//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

@SuppressWarnings("unused")
public class Maze
{
   private int[][] maze;

	public Maze()
	{


	}

	public Maze(int size, String line)
	{
		Scanner x = new Scanner(line);
		maze = new int[size][size];
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				maze[i][j]=x.nextInt();
			}
		}
		x.close();
	}

	public boolean hasExitPath(int r, int c)
	{
		if(c==maze.length){
			return true;
		}
		if(maze[r][c]=='1'){
			maze[r][c]='v';
			if(r+2<maze.length){
				hasExitPath(r+1,c);}
			if(r-1>-1){
				hasExitPath(r-1,c);
			}
			if(c+2<maze.length){
				hasExitPath(r,c+1);
			}
			if(c-1>-1){
				hasExitPath(r,c-1);
			}			
		}
		return false;
	}

	public String toString()
	{
		String output="";
		for(int i = 0; i < maze.length; i++){
			for(int j = 0; j < maze.length; j++){
				output+=maze[i][j] + " ";
			}
			output+="\n";
		}
		if(hasExitPath(0,0)){
			return output+="exit found";
		}
		return output+="exit not found";
	}
}