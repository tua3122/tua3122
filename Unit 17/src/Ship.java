//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;
	private Graphics win;

	public Ship()
	{
		this(0,0,0);
	}

	public Ship(int x, int y)
	{
		this(x,y,0);
	}

	public Ship(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			image = ImageIO.read(new File("H:\\tua3122\\Unit 17\\src\\ship.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("Broken");
		}
	}


	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	public void move(String direction)
	{
		if(direction.equals("LEFT"))
		      setX(getX()-getSpeed());
			if(direction.equals("RIGHT"))
			      setX(getX()+getSpeed());
			if(direction.equals("UP"))
			      setY(getY()-getSpeed());
				  win.setColor(Color.black);
				  win.fillRect(getX()+35, getY()+90, 10, 5);
			if(direction.equals("DOWN"))
			      setY(getY()+getSpeed());
	}

	public void draw( Graphics window )
	{
		win = window;
		window.drawImage(image,getX(),getY(),80,80,null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
