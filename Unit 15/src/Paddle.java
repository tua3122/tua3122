//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   private int speed;

   public Paddle()
   {
	   super(10,10);
      speed =5;
   }


   public Paddle(int x, int y)
   {
	   super(x,y);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int s)
   {
	   super(x,y);
	   speed = s;
   }
   
   public Paddle(int x, int y, int w, int h, int s)
   {
	   super(x,y, w, h);
	   speed = s;
   }
   
   public Paddle(int x, int y, int w, int h, Color c, int s)
   {
	   super(x,y, w, h, c);
	   speed = s;
   }


   public void moveUpAndDraw(Graphics window)
   {
	   if(getY()<=0){
		   
	   }
	   else{
		   super.draw(window, Color.WHITE);
		   setY(getY()-speed);
		   super.draw(window, Color.ORANGE);
	   }
   }

   public void moveDownAndDraw(Graphics window)
   {
	   if(getY()>=425){
		   
	   }
	   else{
		   super.draw(window, Color.WHITE);
		   setY(getY()+speed);
		   super.draw(window, Color.ORANGE);

	   }


   }

   public int getSpeed()
   {
	   return speed;
   }
   
   
   public String toString(){
	   String output = super.toString() + " " + getSpeed();
	   return output;
   }
}