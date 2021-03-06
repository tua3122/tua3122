//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		
		while (b > 0)
	    {
	        int d = b;
	        b = a % b;
	        a = d;
	    }
		
		while (c > 0)
	    {
	        int d = c;
	        c = a % c;
	        a = d;
	    }
		
	    return a;
	}

	public String toString()
	{
		int a=0, b=0, c=0;
		String output="";
		for(int i = 1; i < number; i++){
			a = i;
			for (int j=i; j < number; j++){
				if(((a%2==0)&&(j%2==1))||((a%2==1)&&(j%2==0))){
					b=j;
					for(int k = j; k<number; k++){
						if(k%2==1){
							c = k;
						}
						if((greatestCommonFactor(a,b,c)==1)&&(a*a+b*b==c*c)){
							output = output + a + " " + b + " " + c + "\n";
						}
					}
				}
			}
		}
		return output+"\n";
	}
}