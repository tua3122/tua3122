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
	int number;
	double[] grades;
	
	

	//constructor
	public void Grades(){
	}



	public void setGrades(){
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextInt();
		grades = new double[number];
		for(int i = 0; i<=number-1; i++){
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

	private double getAverage()
	{
		double average=0.0;
		
		average = getSum()/grades.length;

		return average;
	}


	public String toString(){
		String output = "";
		
		for(int i = 1; i <= number; i++){
			output = output+"\ngrade " + i + " :: " + grades[i-1];
		}
		
		return output + "\naverage = " + getAverage();
	}



}