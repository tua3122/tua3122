import java.util.Scanner;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02e
{
	public static void main( String[] args )
   {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Radius: ");
		Double r = keyboard.nextDouble();
		keyboard.close();
		
		Circle lab = new Circle();
		lab.setRadius(r);
		lab.calculateArea();
		lab.print();
	}
}