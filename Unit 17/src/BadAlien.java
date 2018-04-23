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

public class BadAlien extends MovingThing
{
	private int speed, xSpeed, ySpeed;
	private Image image;
	private boolean doDraw;

	public BadAlien()
	{
		this(0,0,0);
		xSpeed = 3;
		ySpeed = 1;
		doDraw = true;
	}

	public BadAlien(int x, int y)
	{
		this(x,y,0);
		setSpeed(31);
		doDraw = true;
	}

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
	
	

	public void setSpeed(int s)
	{
	   setXSpeed(s%10);
	   setYSpeed(s/10);
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	public int getXSpeed(){
		return xSpeed;
	}
	
	public int getYSpeed(){
		return ySpeed;
	}
	
	public void setXSpeed(int s){
		xSpeed = s;
	}
	
	public void setYSpeed(int s){
		ySpeed = s;
	}
	
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

	public boolean didCollideLeft(){
		   if(getX()<=0) {
			   return true;
		   }
		   return false;
	   }
	public boolean didCollideRight(){
		   if(getX()>=755) {
			   return true;
		   }
		   return false;
	   }
	public boolean didCollideTop(){
		   if(getY()<=0)
			{
				return true;
			}
		   return false;
	   }
	public boolean didCollideBottom(){
		   if(getY()>=530)
			{
				return true;
			}
		   return false;
	}
	
	public void setDraw(boolean b){
		doDraw=b;
	}
	

	public String toString()
	{
		return "";
	}
}
