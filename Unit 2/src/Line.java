//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}

	public void calculateSlope( )
	{
		double slopey = yOne-yTwo;
		double slopex = xOne-xTwo;
		slope = slopey/slopex;
	}

	public void print( )
	{
		System.out.printf("%.3f",slope);
	}
}