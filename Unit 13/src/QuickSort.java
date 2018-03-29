import static java.lang.System.*;
import java.util.Arrays;

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{
		passCount=-1;
		quickSort(list, 0, list.length-1);
		passCount++;
		/*System.out.print("pass " + passCount + " [");
		for(int i = 0; i < list.length-1; i++){
			System.out.print(list[i]+", ");
		}
		System.out.print(list[list.length-1]+"]\n");*/
		
		System.out.println("pass " + passCount + " " + Arrays.toString(list)+"\n\n");
	}


	private static void quickSort(Comparable[] list, int low, int high)
	{		
		if(low < high){
			passCount++;
			System.out.println("pass " + passCount + " " + Arrays.toString(list));
			/*for(int i = 0; i < list.length-1; i++){
				System.out.print(list[i]+", ");
			}*/
			int part = partition(list, low, high);
			quickSort(list, low, part - 1);
			quickSort(list, part + 1, high);	
					
		}
	}


	private static int partition(Comparable[] list, int low, int high)
	{
		
		int pivot = (int) list[high];
		int i = (low-1);
		for(int j = low; j < high; j++){
			if((int)list[j]<=pivot){
				i++;
				int temp = (int)list[i];
				list[i] = list[j];
				list[j] = temp;
			}
		}
		
		int temp = (int)list[i+1];
		list[i+1] = list[high];
		list[high] = temp;
		
		return i+1;
	}
}