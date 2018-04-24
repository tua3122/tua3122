import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * A class that represents an alien. This class inherits from 
 * MovingThing and allows the user to add functionality to 
 * the Alien class.
 * 
 * @author tua3122
 */
public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	/**
	 * Constructor that takes no arguments.
	 */
	public Alien()
	{
		this(0,0,0);
	}

	/**
	 * Constructor that creates the alien and sets its position.
	 * @param x the initial x-coordinate of the alien.
	 * @param y the initial y-coordinate of the alien.
	 */
	public Alien(int x, int y)
	{
		this(x,y,0);
	}

	/**
	 * Constructor that creates the alien and sets its appearance, position, and speed.
	 * @param x the initial x-coordinate of the alien.
	 * @param y the initial y-coordinate of the alien.
	 * @param s the initial speed of the alien.
	 */
	public Alien(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			image = ImageIO.read(new File("H:\\tua3122\\Unit 17\\src\\alien.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("Broken");
		}
	}

	/**
	 * Method that sets the speed of the alien.
	 * @param s the speed the alien will be set to.
	 */
	public void setSpeed(int s)
	{
	   speed = s;
	}

	/**
	 * Method that gets the speed of the alien.
	 * @return an integer representing the speed of the alien.
	 */
	public int getSpeed()
	{
	   return speed;
	}
	
	/**
	 * Method that changes the x-position of the alien.
	 * @param direction is for extension purposes and is not used.
	 */
	public void move(String direction)
	{
		setX(getX()+getSpeed());
	}

	/**
	 * Method that draws the alien on the window.
	 * @param window indicates where the alien is drawn.
	 */
	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),40,40,null);
	}
	
	/**
	 * Method that returns an empty string.
	 */
	public String toString()
	{
		return "";
	}
}
