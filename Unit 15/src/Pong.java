//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.lang.*;

@SuppressWarnings({ "serial", "unused" })
public class Pong extends Canvas implements KeyListener, Runnable
{
	//private Ball ball;
	private BlinkyBall ball;
	//private SpeedUpBall ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	int rightScore,leftScore;

	public Pong()
	{		
		//ball = new Ball(200, 200, 10, 10, Color.BLUE);
		ball= new  BlinkyBall(200,200,10,10);
		//ball = new SpeedUpBall(200,200,10,10, Color.BLUE, 1, 1);
		leftPaddle = new Paddle(30, 300, 10, 80, Color.ORANGE, 5);
		rightPaddle = new Paddle(740, 300, 10, 80, Color.ORANGE, 5);
		keys = new boolean[4];
		rightScore=0;
		leftScore=0;

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);
	}
	
   public void update(Graphics window){
	   paint(window);
	   window.setColor(Color.RED);
	   window.drawString("SCOREBOARD", 350, 10);
	   window.drawString("Left:" + leftScore, 350, 30);
	   window.drawString("Right:" + rightScore, 350, 50);
   }

   public void paint(Graphics window)
   {
	   Graphics2D twoDGraph = (Graphics2D)window;
	   ball.moveAndDraw(window);
		leftPaddle.draw(window);
		rightPaddle.draw(window);
		if(ball.didCollideLeft(window)||ball.didCollideRight(window))
		{
			window.setColor(Color.WHITE);
			   window.fillRect(350, 10, 50, 100);
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			if(ball.getX()<=10) {
				rightScore++;
			}
			else if(ball.getY()>=10){
				leftScore++;
			}
			window.setColor(Color.WHITE);
			window.fillRect(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
			//ball = new Ball(200, 200, 10, 10, Color.BLUE);
			ball = new BlinkyBall(200,200,10,10);
			//ball = new SpeedUpBall(200,200,10,10, Color.BLUE, 1, 1);
		}
		if(ball.didCollideBottom(window)||ball.didCollideTop(window))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		if(ball.didCollidePaddle(leftPaddle)||ball.didCollidePaddle(rightPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}

		if(keys[0] == true)
		{
			leftPaddle.moveUpAndDraw(window);
		}
		if(keys[1] == true)
		{
			leftPaddle.moveDownAndDraw(window);
		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(window);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(window);
		}
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'S' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'K' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'S' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'K' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   @SuppressWarnings("static-access")
public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}