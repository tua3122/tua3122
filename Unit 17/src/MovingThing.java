//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("unused")
public abstract class MovingThing implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	public MovingThing()
	{
		setPos(10,10);
		setWidth(10);
		setHeight(10);
	}

	public MovingThing(int x, int y)
	{
		setPos(x,y);
		setWidth(10);
		setHeight(10);
	}
	
	public MovingThing(int x, int y, int w, int h)
	{
		setPos(x,y);
		setWidth(w);
		setHeight(h);
	}

	public void setPos( int x, int y)
	{
		xPos = x;
		yPos = y;
	}


	public void setX(int x)
	{
		xPos = x;
	}


	public void setY(int y)
	{
		yPos = y;
	}

	public int getX()
	{
		return xPos;
	}


	public int getY()
	{
		return yPos;
	}
	
	
	public void setWidth(int w)
	{
		width = w;
	}

	public void setHeight(int h)
	{
		height = h;
	}

	public int getWidth()
	{
		return width;  
	}

	public int getHeight()
	{
		return height;  
	}

	/*public abstract void setSpeed( int s );
	public abstract int getSpeed();
	public abstract void draw(Graphics window);

	public void move(String direction)
	{
		if(direction.equals("LEFT"))
	      setX(getX()-getSpeed());
		if(direction.equals("RIGHT"))
		      setX(getX()+getSpeed());
		if(direction.equals("UP"))
		      setY(getY()-getSpeed());
		if(direction.equals("DOWN"))
		      setY(getY()+getSpeed());
	}*/

	public abstract void move(String direction);
	public abstract void draw(Graphics window);

	public String toString()
	{
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight();
	}
}