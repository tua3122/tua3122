public class Numbers {
	
	public static void main(String[]args){
		int[] list = getSomeGoofyNumbers(15);
		for(int i = 0; i<list.length; i++){
			if(i==list.length-1){
				System.out.print(list[i]);
			}
			else{
				System.out.print(list[i]+ ", ");
			}
		}
		//Correct for first 7 goofy numbers.
	}
	
	
	public static boolean isGoofy(int num){
		/*This method returns true if the sum of the first and second digits is odd.
		This matches the given output up to 13, of which the sum is 14.*/
		int even = num/10 + num%10;
		if(even%2 == 1){
			return true;
		}
		return false;
	}
	
	public static int[] getSomeGoofyNumbers(int count){
		int[] list = new int[count];
		int i = 1, j = 0;
		while(j<count){
			if(isGoofy(i)){
				list[j] = i;
				j++;
			}
			i++;
		}
		return list;
	}
}