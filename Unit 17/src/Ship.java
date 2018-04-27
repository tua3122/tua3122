import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * A class that represents a ship. This class inherits from 
 * MovingThing and allows the user to add functionality to 
 * the Ship class.
 * 
 * @author tua3122
 */
public class Ship extends MovingThing
{
	private int speed;
	private Image image;
	private Graphics win;
	private boolean doDraw;

	/**
	 * Constructor that takes no arguments.
	 */
	public Ship()
	{
		this(0,0,0);
	}

	/**
	 * Constructor that creates the ship and sets its position.
	 * @param x the initial x-coordinate of the ship.
	 * @param y the initial y-coordinate of the ship.
	 */
	public Ship(int x, int y)
	{
		this(x,y,0);
	}

	/**
	 * Constructor that creates the ship and sets its appearance, position, and speed.
	 * @param x the initial x-coordinate of the ship.
	 * @param y the initial y-coordinate of the ship.
	 * @param s the initial speed of the ship.
	 */
	public Ship(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		doDraw=true;
		try
		{
			image = ImageIO.read(new File("H:\\tua3122\\Unit 17\\src\\ship.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("Broken");
		}
	}

	/**
	 * Method that sets the speed of the ship.
	 * @param s the speed the ship will be set to.
	 */
	public void setSpeed(int s)
	{
	   speed = s;
	}

	/**
	 * Method that gets the speed of the ship.
	 * @return an integer representing the speed of the ship.
	 */
	public int getSpeed()
	{
	   return speed;
	}
	
	/**
	 * Method that changes the position of the ship.
	 * @param direction is for extension purposes and is not used.
	 */
	public void move(String direction)
	{
		if(direction.equals("LEFT"))
		      setX(getX()-getSpeed());
			if(direction.equals("RIGHT"))
			      setX(getX()+getSpeed());
			if(direction.equals("UP"))
			      setY(getY()-getSpeed());
				  win.setColor(Color.black);
				  win.fillRect(getX(), getY()+90, 100, 10);
			if(direction.equals("DOWN"))
			      setY(getY()+getSpeed());
	}

	/**
	 * Method that draws the ship on the window.
	 * @param window indicates where the ship is drawn.
	 */
	public void draw( Graphics window )
	{
		win = window;
		if(doDraw){
			window.drawImage(image,getX(),getY(),80,80,null);
		}
		else{
			setSpeed(0);
			window.setColor(Color.BLACK);
			window.fillRect(getX(), getY(), getWidth(), getHeight());
		}
		
	}
	
	/**
	 * Method that sets whether the ship is visible and functioning.
	 * @param b is a boolean that represents the ship's desired visibility.
	 */
	public void setDraw(boolean b){
		doDraw=b;
	}
	
	/**
	 * Method that returns whether the ship is visible and functioning.
	 * @return is a boolean that represents the ship's visibility.
	 */
	public boolean getDraw(){
		return doDraw;
	}

	/**
	 * Method that returns the ship's position and speed.
	 */
	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
