//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

	public Block()
	{
		//reflects the conditions in pong1.doc
		setPos(100, 150);
		setW(10);
		setH(10);
		setColor(Color.BLACK);
	}
	
	//for Ball.java
	public Block(int x, int y){
		setPos(x,y);
		setW(10);
		setH(10);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y, int w, int h)
	{
		setPos(x,y);
		setW(w);
		setH(h);
		setColor(Color.BLACK);
	}
	
	
	public Block(int x, int y, int w, int h, Color col)
	{
		setPos(x,y);
		setW(w);
		setH(h);
		setColor(col);
	}
	
	public void setPos(int x, int y){
		xPos=x;
		yPos=y;
	}
	
	public void setX(int x){
		xPos=x;
	}
	
	public void setY(int y){
		yPos=y;
	}
	
	public void setW(int w){
		width=w;
	}
	
	public void setH(int h){
		height=h;
	}

   public void setColor(Color col)
   {
	   color = col;
   }
   
   public int getX(){
	   return xPos;
   }
   
   public int getY(){
	   return yPos;
   }
   
   public int getWidth()
   {
	   return width;
   }
   
   public int getHeight()
   {
	   return height;
   }
   
   public Color getColor(){
	   return color;
   }
   
   

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {


   }
   
	public boolean equals(Block obj)
	{
		if(xPos==obj.getX() && yPos==obj.getY() && width==obj.getWidth() && height==obj.getHeight() && color==obj.getColor()){
			return true;
		}
		return false;
	}   

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	
	public String toString(){
		String output = getX() +" " + getY() +" " + getWidth() +" " + getHeight() +" " + getColor();
		return output;
	}
}

