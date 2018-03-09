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

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("H:\\tua3122\\Unit 11\\src\\gradebook.dat"));
		
		String className = file.next();
		file.nextLine();
		int num = file.nextInt();
		Class myClass = new Class(className, num);
		
		String name, gradeList;
		Student stu;
		
		for(int i = 0; i<num; i++){
			name = file.nextLine();
			gradeList = file.nextLine();
			stu = new Student(name, gradeList);
			myClass.addStudent(i, stu);
		}
		
		System.out.println(myClass);

	}		
}