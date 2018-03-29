//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y)
	{
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h)
	{
		super(x, y, w, h);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color c)
	{
		super(x, y, w, h, c);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color c, int xS, int yS)
	{
		super(x, y, w, h, c);
		setXSpeed(xS);
		setYSpeed(yS);
		
	}
	
	public void setXSpeed(int xS)
	{
		xSpeed=xS;
	}
	
	public void setYSpeed(int yS)
	{
		ySpeed=yS;
	}
	
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   window.drawOval(getX(), getY(), getWidth(), getHeight());


      setX(getX()+xSpeed);
		setY(getY()+ySpeed);

		window.drawOval(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Ball obj)
	{
		if(super.equals(obj) && xSpeed==obj.xSpeed && ySpeed==obj.ySpeed){
			return true;
		}
		return false;
	}   

   public int getXSpeed()
   {
	   return xSpeed;
   }
   
   public int getYSpeed()
   {
	   return ySpeed;
   }

   public String toString(){
	   String output = super.toString() + " " + getXSpeed() + " " + getYSpeed();
	   return output;
   }
}