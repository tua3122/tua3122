//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class GradeBookRunner
{
   public static void main( String args[] )
   {
	   ArrayList<Class> myClass = new ArrayList<Class>();
	   out.println("Welcome to the Class Stats program!");
	   
	   Scanner keyboard = new Scanner(System.in);
	   String res= "y";
	   while(res == "y"){
		   out.print("Enter class name: ");
		   String name = keyboard.nextLine();
		   out.print("Enter number of students: ");
		   int stuCount = keyboard.nextInt();
		   Class cl = new Class(name,stuCount);
		   for(int i = 1; i<=stuCount; i++){
			   out.println("Enter info of student " + i +": ");
			   cl.addStudent(i, new Student(keyboard.next(), keyboard.next()));
		   }
		   myClass.add(cl);
		   out.print("Add more classes (y)? ");
		   res = keyboard.nextLine();
	   }
	   keyboard.close();
	}		
}