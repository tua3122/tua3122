//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

@SuppressWarnings("unused")
public class Grades
{
	private ArrayList<Double> grades;
	
	public Grades()
	{
		
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner sc = new Scanner(gradeList);
		int num = sc.nextInt();
		sc.next(); //skips -
		grades = new ArrayList<Double>();
		
		for(int i = 0; i < num; i++){
			grades.add(sc.nextDouble());
		}
		
		sc.close();
	}
	
	public void setGrade(int spot, double grade)
	{
		grades.add(grade);
	}
	
	public double getSum()
	{
		double sum=0.0;
		
		for(int i = 0; i < grades.size(); i++){
			sum += grades.get(i);
		}

		return sum;
	}
	
	public int getLength(){
		return grades.size();
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		
		for(int i = 0; i<grades.size(); i++){
			if(grades.get(i)<low){
				low = grades.get(i);
			}
		}

		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		
		for(int i = 0; i<grades.size(); i++){
			if(grades.get(i)>high){
				high = grades.get(i);
			}
		}

		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public double getAverage()
	{
		double average = getSum();
		return average/grades.size();
	}
	
	
	
	public String toString()
	{
		String output="";
		
		for(int i = 0; i<grades.size(); i++){
			output+= grades.get(i) + " ";
		}

		return output;
	}	
	
}