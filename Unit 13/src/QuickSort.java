import static java.lang.System.*;
import java.util.Arrays;

public class QuickSort
{
	private static int passCount;

	public static void quickSort(int[] list)
	{
		passCount=0;
		quickSort(list, 0, list.length-1);
		System.out.print("pass " + passCount + " [");
		for(int i = 0; i < list.length-1; i++){
			System.out.print(list[i]+", ");
		}
		System.out.print(list[list.length-1]+"]\n");
	}


	private static void quickSort(int[] list, int low, int high)
	{
		if(low < high){
			int part = partition(list, low, high);
			quickSort(list, low, part - 1);
			quickSort(list, part + 1, high);
		}
	}


	private static int partition(int[] list, int low, int high)
	{
		int pivot = list[high];
		int i = (low-1);
		for(int j = low; j < high; j++){
			if(list[j]<=pivot){
				passCount++;
				i++;
				int temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
		}
		
		int temp = list[i+1];
		list[i+1] = list[high];
		list[high] = temp;
		return i+1;
	}
}