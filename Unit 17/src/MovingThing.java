import java.awt.Graphics;

/**
 * Interface to describe a moveable object that implements locatable. A moveable object
 * can have a x-coordinate and a y-coordinate. The position and
 * the individual coordinates can be set. The individual coordinates
 * can be returned. The object can have a width and a height which can 
 * also be set and returned. 
 *  
 * @author tua3122
 */
public abstract class MovingThing implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	/**
	 * The default constructor.
	 */
	public MovingThing()
	{
		setPos(10,10);
		setWidth(10);
		setHeight(10);
	}

	/**
	 * Constructor that sets the position of the object.
	 * @param x is the x-position of the object.
	 * @param y is the y-position of the object.
	 */
	public MovingThing(int x, int y)
	{
		setPos(x,y);
		setWidth(10);
		setHeight(10);
	}
	
	/**
	 * Constructor that sets the position and dimensions of the object.
	 * @param x is the x-position of the object.
	 * @param y is the y-position of the object.
	 * @param w is the width of the object.
	 * @param h is the height of the object.
	 */
	public MovingThing(int x, int y, int w, int h)
	{
		setPos(x,y);
		setWidth(w);
		setHeight(h);
	}

	/**
	 * Method that sets the position of the object.
	 * @param x is the x-position of the object.
	 * @param y is the y-position of the object.
	 */
	public void setPos( int x, int y)
	{
		xPos = x;
		yPos = y;
	}

	/**
	 * Method that sets the x-position of the object.
	 * @param x the x-position the object will be set to.
	 */
	public void setX(int x)
	{
		xPos = x;
	}

	/**
	 * Method that sets the y-position of the object.
	 * @param y the y-position the object will be set to.
	 */
	public void setY(int y)
	{
		yPos = y;
	}

	/**
	 * Method that accesses the x-position of the object.
	 * @param xPos the x-position the object is at.
	 */
	public int getX()
	{
		return xPos;
	}

	/**
	 * Method that accesses the y-position of the object.
	 * @param yPos the y-position the object is at.
	 */
	public int getY()
	{
		return yPos;
	}
	
	/**
	 * Method that sets the width of the object.
	 * @param w the width the object will be set to.
	 */
	public void setWidth(int w)
	{
		width = w;
	}

	/**
	 * Method that sets the height of the object.
	 * @param h the height the object will be set to.
	 */
	public void setHeight(int h)
	{
		height = h;
	}

	/**
	 * Method that returns the width of the object.
	 * @return the width of the object.
	 */
	public int getWidth()
	{
		return width;  
	}

	/**
	 * Method that returns the height of the object.
	 * @return the height of the object.
	 */
	public int getHeight()
	{
		return height;  
	}

	/**
	 * Abstract method that changes the position of the object.
	 * @param direction indicates the direction the object moves in.
	 */
	public abstract void move(String direction);
	
	/**
	 * Abstract method that draws the object on the window.
	 * @param window indicates where the object is drawn.
	 */
	public abstract void draw(Graphics window);

	/**
	 * Method that returns the position and dimensions of the object.
	 */
	public String toString()
	{
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight();
	}
}