//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;
public class Lab02g
{
	public static void main( String[] args )
	{
		Scanner key = new Scanner(System.in);
		Fahrenheit lab = new Fahrenheit();
		
		System.out.print("Input degrees Fahrenheit: ");
		double fahren = key.nextDouble();
		lab.setFahrenheit(fahren);
		lab.print();
		
		key.close();
	}
}