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
	private Ball ball;
	//private BlinkyBall ball;
	//private SpeedUpBall ball;
	private Paddle paddle;
	private BlockHorde blocks;
	private boolean up;
	private boolean[] keys;
	private BufferedImage back;
	int size, score, tempscore, level;

	public Pong()
	{		
		ball = new Ball(175, 200, 10, 10, Color.BLUE, 3, 1);
		paddle = new Paddle(400, 250, 40, 40, Color.ORANGE, 5);
		blocks = new BlockHorde();
		keys = new boolean[5];
		size = blocks.getSize();
    	setBackground(Color.WHITE);
		setVisible(true);
		level = 1;
		new Thread(this).start();
		addKeyListener(this);
	}
	
   public void update(Graphics window){
	   score = size-blocks.getSize();
	   paint(window);
	   window.setColor(Color.WHITE);
	   if(tempscore!=score){
		   window.fillRect(370, 90, 50, 40);
		   window.setColor(Color.RED);
		   window.drawString("Score:" + score, 370, 100);
		   window.drawString("Level: " + level, 370, 115);
		   tempscore=score;
	   }
	   if(score==size){
		   blocks = new BlockHorde();
		   up = true;
		   level++;
	   }
	   
   }

   public void paint(Graphics window)
   {
	   Graphics2D twoDGraph = (Graphics2D)window;
	   blocks.drawEmAll(window);
	   int x = blocks.removeDeadOnes(ball);
	   ball.moveAndDraw(window);
		paddle.draw(window);
		if(up){
			up=false;
			if(ball.getXSpeed()==3){
				ball.setXSpeed(1);
				ball.setYSpeed(3);
			}
			else if(ball.getXSpeed()==1){
				ball.setXSpeed(3);
				ball.setYSpeed(1);
			}
			
		}
		if(ball.didCollideLeft(window)||ball.didCollideRight(window))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		if(ball.didCollideBottom(window)||ball.didCollideTop(window))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		if(ball.didCollidePaddle(paddle)&&ball.didCollidePaddleY(paddle)){
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		if(ball.didCollidePaddle(paddle)&&ball.didCollidePaddleX(paddle)){
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		if(ball.getXSpeed()==0||ball.getYSpeed()==0){
			ball.setYSpeed(1);
			ball.setXSpeed(1);
			ball.setPos(100, 200);
		}
		if(x==1){
			ball.setYSpeed(-ball.getYSpeed());
		}
		if(x==2){
			ball.setXSpeed(-ball.getXSpeed());
		}

		if(keys[0] == true)
		{
			paddle.moveUpAndDraw(window);
		}
		if(keys[1] == true)
		{
			paddle.moveDownAndDraw(window);
		}
		if(keys[2] == true)
		{
			paddle.moveLeftAndDraw(window);
		}
		if(keys[3] == true)
		{
			paddle.moveRightAndDraw(window);
		}
		if(keys[4] == true)
		{
			blocks.removeS();
			up = true;
		}
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'S' : keys[1]=true; break;
			case 'A' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
			case 'R' : keys[4]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'S' : keys[1]=false; break;
			case 'A' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
			case 'R' : keys[4]=false; break;
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