//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 1;
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
	   super.draw(window, Color.WHITE);
	   setX(getX()+xSpeed);
	   setY(getY()+ySpeed);
	   super.draw(window, Color.BLACK);
   }
   
	public boolean equals(Ball obj)
	{
		if(super.equals(obj)){ //&& xSpeed==obj.xSpeed && ySpeed==obj.ySpeed
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
   
   public boolean didCollideLeft(Object obj){
	   Paddle leftPaddle = (Paddle) obj;
	   if (equals(obj)){
		   if(getX()>leftPaddle.getX() && getX() < leftPaddle.getX()+leftPaddle.getWidth()){
				if(getY()>leftPaddle.getY() && getY() < leftPaddle.getY()+leftPaddle.getHeight()){
					return true;
				}
			}
	   }
	   return false;
   }
   public boolean didCollideRight(Object obj){
	   Paddle rightPaddle = (Paddle) obj;
	   if (equals(obj)){
		   if(getX()>rightPaddle.getX() && getX() < rightPaddle.getX()+rightPaddle.getWidth()){
				if(getY()>rightPaddle.getY() && getY() < rightPaddle.getY()+rightPaddle.getHeight()){
					return true;
				}
			}
	   }
	   return false;
   }
   public boolean didCollideTop(Object obj){
	   if(!(getY()>=10))
		{
			return true;
		}
	   return false;
   }
   public boolean didCollideBottom(Object obj){
	   if(!(getY()<=550))
		{
			return true;
		}
	   return false;
   }
}