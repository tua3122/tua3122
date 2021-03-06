//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;
	private boolean output;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
		output = true;
		
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public Integer getNumber()
	{
		int n = 0;
		int i =0;
		while (roman.length()>0){
			if((roman.length()>=2)&&(roman.substring(0,2).equals(LETTERS[i]))){
				n = n + NUMBERS[i];
				roman = roman.substring(2, roman.length());
				i=0;
			}
			else if (roman.substring(0,1).equals(LETTERS[i])){
				n = n + NUMBERS[i];
				roman = roman.substring(1, roman.length());
				i=0;
			}
			else{
				i++;
			}
		}
		return n;
	}
	
	public String getRoman(){
		String r = "";
		int i = 0;
		while (number != 0){
			if(NUMBERS[i]<=number){
				r = r + LETTERS[i];
				number = number - NUMBERS[i];
				i=0;
			}
			else{
				i++;
			}
		}
		return r;
	}

	public String toString()
	{
		return getRoman() + "\n";
		
	}
}