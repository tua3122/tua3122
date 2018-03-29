//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{	
		list = new ArrayList<String>();
	}

	//modfiers
	public void add( String  word)
	{
		int loc = 0;
		if(list.indexOf(word)!=-1){
			return;
		}
		list.add(word);
		
		int i, j;
		String key;
		for (j = 1; j < list.size(); j++) {
		    key = list.get(j);
		    i = j - 1;
		    while (i >= 0) {
		      if (key.compareTo(list.get(i)) > 0) {
		        break;
		      }
		      list.set(i+1, list.get(i));
		      i--;
		    }
		    list.set(i+1, key);
		  }
	}


	public void remove(String word)
	{
		list.remove(word);
	}

	public String toString()
	{
		String output = "";
		for(int i = 0; i <= list.size()-1; i++){
			output+=(list.get(i)+" ");
		}
		return output;
	}
}