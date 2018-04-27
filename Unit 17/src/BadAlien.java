import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * A class that represents a bouncing alien. This class inherits from 
 * MovingThing and allows the user to add functionality to 
 * the Alien class.
 * 
 * @author tua3122
 */
public class BadAlien extends MovingThing
{
	private int speed, xSpeed, ySpeed;
	private Image image;
	private boolean doDraw;

	/**
	 * Constructor that takes no arguments.
	 */
	public BadAlien()
	{
		this(0,0,0);
		xSpeed = 3;
		ySpeed = 1;
		doDraw = true;
	}

	/**
	 * Constructor that creates the alien and sets its position.
	 * @param x the initial x-coordinate of the alien.
	 * @param y the initial y-coordinate of the alien.
	 */
	public BadAlien(int x, int y)
	{
		this(x,y,0);
		setSpeed(31);
		doDraw = true;
	}

	/**  
	 * Constructor that creates the alien and sets its appearance, position, and speed.
	 * @param x the initial x-coordinate of the alien.
	 * @param y the initial y-coordinate of the alien.
	 * @param s the initial speed of the alien, with the last digit being the y-speed and the preceding digits being the x-speed.
	 */
	public BadAlien(int x, int y, int s)
	{
		super(x, y);
		setSpeed(s);
		doDraw = true;
		try
		{
			image = ImageIO.read(new File("H:\\tua3122\\Unit 17\\src\\badalien.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("Broken");
		}
	}
	
	
	/**
	 * Sets the speed of the alien.
	 * @param s is the speed the alien will be set to, with the last digit being the y-speed and the preceding digits being the x-speed.
	 */
	public void setSpeed(int s)
	{
	   setYSpeed(s%10);
	   setXSpeed(s/10);
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
	 * Method that gets the x-speed of the alien.
	 * @return an integer representing the x-speed of the alien.
	 */
	public int getXSpeed(){
		return xSpeed;
	}
	
	/**
	 * Method that gets the y-speed of the alien.
	 * @return an integer representing the y-speed of the alien.
	 */
	public int getYSpeed(){
		return ySpeed;
	}
	
	/**
	 * Method that sets the x-speed of the alien.
	 * @param s is the x-speed the alien will be set to.
	 */
	public void setXSpeed(int s){
		xSpeed = s;
	}
	
	/**
	 * Method that sets the x-speed of the alien.
	 * @param s is the x=y-speed the alien will be set to.
	 */
	public void setYSpeed(int s){
		ySpeed = s;
	}
	
	/**
	 * Method that changes the position of the alien.
	 * @param direction is for extension purposes and is not used.
	 */
	public void move(String direction)
	{
		if(didCollideLeft()||didCollideRight())
		{
			setXSpeed(-getXSpeed());
			
		}
		if(didCollideBottom()||didCollideTop())
		{
			setYSpeed(-getYSpeed());
		}
		setX(getX()+getXSpeed());
		setY(getY()+getYSpeed());
	}

	/**
	 * Method that draws the alien on the window.
	 * @param window indicates where the alien is drawn.
	 */
	public void draw( Graphics window )
	{
		if(doDraw){
			window.drawImage(image,getX(),getY(),40,40,null);
		}
		else{
			setX(3000);
			setY(3000);
			setXSpeed(0);
			setYSpeed(0);
			window.setColor(Color.BLACK);
			window.fillRect(getX(), getY(), getWidth(), getHeight());
		}
	}

	/**
	 * Method that detects if the alien has hit the left boundary.
	 * @return boolean indicating if the alien has hit the boundary.
	 */
	public boolean didCollideLeft(){
		   if(getX()<=0) {
			   return true;
		   }
		   return false;
	   }
	
	/**
	 * Method that detects if the alien has hit the right boundary.
	 * @return boolean indicating if the alien has hit the boundary.
	 */
	public boolean didCollideRight(){
		   if(getX()>=755) {
			   return true;
		   }
		   return false;
	   }
	
	/**
	 * Method that detects if the alien has hit the top boundary.
	 * @return boolean indicating if the alien has hit the boundary.
	 */
	public boolean didCollideTop(){
		   if(getY()<=0)
			{
				return true;
			}
		   return false;
	}
	
	/**
	 * Method that detects if the alien has hit the bottom boundary.
	 * @return boolean indicating if the alien has hit the boundary.
	 */
	public boolean didCollideBottom(){
		   if(getY()>=530)
			{
				return true;
			}
		   return false;
	}
	
	/**
	 * Method that sets whether the alien is visible and functioning.
	 * @param b is a boolean that represents the alien's desired visibility.
	 */
	public void setDraw(boolean b){
		doDraw=b;
	}
	
	/**
	 * Method that returns an empty string.
	 */
	public String toString()
	{
		return "";
	}
}
