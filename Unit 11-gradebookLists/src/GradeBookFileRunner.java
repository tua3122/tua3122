//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

@SuppressWarnings("unused")
public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!\n\n");
		
		try{
			String fileName = "gradebook.dat";
			Scanner file = new Scanner(new File("H:\\tua3122\\Unit 11\\src\\"+fileName));
			String className = file.nextLine();
			int num = file.nextInt();
			file.nextLine();
			Class myClass = new Class(className, num);
		
			String name, gradeList;
		
			for(int i = 0; i<num; i++){
				name = file.nextLine();
				gradeList = file.nextLine();
				myClass.addStudent(i, new Student(name, gradeList));
			}
			
			System.out.println(myClass);
			out.println("Failure List = " + myClass.getFailureList(70));	
			out.println("Highest Average = " + myClass.getStudentWithHighestAverage());
			out.println("Lowest Average = " + myClass.getStudentWithLowestAverage());
									
			out.println(String.format("Class Average = %.2f",myClass.getClassAverage()));	
			file.close();
		}
		catch(Exception e){
			System.out.println("error");
		}
		
		
	}		
}