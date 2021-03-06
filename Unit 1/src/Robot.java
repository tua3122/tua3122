//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
	
	
	public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      head(window);
      upperBody(window);
      lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);
      window.fillOval(300, 100, 200, 100);
      
      window.setColor(Color.GREEN);
      window.fillOval(340, 130, 20, 20);
      window.fillOval(440, 130, 20, 20);
      
      window.setColor(Color.RED);
      window.fillOval(390, 160, 20, 20);
   }

   public void upperBody( Graphics window )
   {

	   window.setColor(Color.BLUE);

	   window.fillOval(300, 200, 200, 100);   }

   public void lowerBody( Graphics window )
   {

	   window.setColor(Color.BLUE);

	   window.fillOval(300, 300, 200, 100);   }
}