//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	double[] grades;
	int number;
	
	

	//constructor
	public void Grades(){
		
	}



	public void setGrades(){
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextInt();
		for(int i = 0; i<=number; i++){
			grades[i] = keyboard.nextInt();
		}
		keyboard.close();
		
	}



	private double getSum()
	{
		double sum=0.0;
		
		for(int i = 0; i<grades.length; i++){
			sum = sum+grades[i];
		}

		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		
		average = getSum()/grades.length;

		return average;
	}


	public String toString(){
		String output = "";
		
		for(int i = 1; i <= number; i++){
			output = output+" grade " + i + " :: " + grades[i-1];
		}
		
		return output + "\naverage = " + getAverage();
	}



}