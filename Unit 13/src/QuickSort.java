//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{
		passCount = 0;
		quickSort(list, (int) list[0], (int)list[list.length-1]);
	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		passCount++;
		if (low<high){
			int pi = partition(list, low, high);
			
			quickSort(list, low, pi - 1);
			quickSort(list, pi + 1, high);
		}
	}


	private static int partition(Comparable[] list, int low, int high)
	{
		int pivot = high;
		
		int i = (low - 1);
		for(int j = low; j <= high -1; j++){
			if((int)list[j]<=pivot){
				i++;
				int temp = (int) list[j];
				list[j]=list[i];
				list[i]=temp;
			}
			
			
		}
		int temp = (int)list[i+1];
		list[i+1] = (int) list[high];
		list[high]= temp;
		return (i+1);
	}
}