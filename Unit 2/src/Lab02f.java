//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;
public class Lab02f
{
	public static void main( String[] args )
   {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input coordinates:");
		int x1 = keyboard.nextInt();
		int y1 = keyboard.nextInt();
		int x2 = keyboard.nextInt();
		int y2 = keyboard.nextInt();
		System.out.println("Slope: ");
		keyboard.close();
		
		Line lab = new Line(x1, y1, x2, y2);
		lab.setCoordinates(x1, y1, x2, y2);
		lab.calculateSlope();
		lab.print();		
	}
}