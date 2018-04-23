import java.awt.Color;
import java.awt.Graphics;

/**
 * A class that represents the shot ammo. This class inherits from 
 * MovingThing and allows the user to add functionality to 
 * the Ammo class.
 * 
 * @author tua3122d
 */
public class Ammo extends MovingThing
{
	private int speed;

	/**
	 * Constructor that takes no arguments.
	 */
	public Ammo()
	{
		this(0,0,0);
	}

	/**
	 * Constructor that creates the ammo and sets its position. Sets the speed to 3.
	 * @param x the initial x-coordinate of the ammo.
	 * @param y the initial y-coordinate of the ammo.
	 */
	public Ammo(int x, int y)
	{
		super(x, y);
		setSpeed(3);
	}

	/**
	 * Constructor that creates the ammo and sets its position and speed.
	 * @param x the initial x-coordinate of the ammo.
	 * @param y the initial y-coordinate of the ammo.
	 * @param s the speed of the ammo.
	 */
	public Ammo(int x, int y, int s)
	{
		super(x, y);
		setSpeed(s);
	}

	/**
	 * Method that sets the speed of the ammo.
	 * @param s the speed the ammo will be set to.
	 */
	public void setSpeed(int s)
	{
	   speed = s;
	}

	/**
	 * Method that gets the speed of the ammo.
	 * @return an integer representing the speed of the ammo.
	 */
	public int getSpeed()
	{
	   return speed;
	}

	/**
	 * Method that draws the ammo on the window.
	 * @param window indicates where the ammo is drawn.
	 */
	public void draw( Graphics window )
	{
		window.setColor(Color.black);
		window.fillRect(getX(), getY(), 5, 5);
		move("");
		window.setColor(Color.YELLOW);
		window.fillRect(getX(), getY(), 5, 5);
	}
	
	/**
	 * Method that changes the y-position of the ammo.
	 * @param direction is for extension purposes and is not used.
	 */
	public void move( String direction )
	{
		setY(getY()+getSpeed());
	}

	/**
	 * Method that returns an empty string.
	 */
	public String toString()
	{
		return "";
	}
}
