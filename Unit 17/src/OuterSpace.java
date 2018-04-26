import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * The class that runs the other classes to let them
 * interact and create the game. User input is taken 
 * and interpreted.
 * 
 * @author tua3122
 */
@SuppressWarnings({ "serial", "unused" })
public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private int timer;
	private BadAlien alien, alien2;

	private AlienHorde horde;
	private Bullets shots;	

	private boolean[] keys;
	private BufferedImage back;

	/**
	 * Constructor that initiates the objects and variables and sets them as visible.
	 */
	public OuterSpace()
	{
		timer = 0;
		setBackground(Color.black);

		keys = new boolean[5];
		ship = new Ship(350, 450, 2);
		horde = new AlienHorde(64);
		shots = new Bullets();
		shots.add(new Ammo(-10,-10,0));
		alien = new BadAlien(100,100,21);
		alien2 = new BadAlien(100,100,13);

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

	/**
	 * Method that calls the paint method.
	 */
   public void update(Graphics window)
   {
	   paint(window);
   }

   /**
    * Method that moves and draws the objects, updates the timer, and refreshes the window.
    * Detects user input and detects if the bad aliens have killed the ship.
    */
	public void paint( Graphics window )
	{
		ship.draw(window);
		
		shots.cleanEmUp(window);
		shots.moveEmAll();
		shots.drawEmAll(window);
		timer++;
		
		horde.moveEmAll();
		horde.drawEmAll(window);
		horde.removeDeadOnes(shots.getList());
		
		alien.move("");
		alien.draw(window);
		alien2.move("");
		alien2.draw(window);
		
		if(back==null){
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));
		}
		Graphics graphToBack = back.createGraphics();
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		

		if(keys[0] == true && ship.getX()>=-20)
		{
			ship.move("LEFT");
		}
		
		if(keys[1] == true && ship.getX()<=725)
		{
			ship.move("RIGHT");
		}
		
		if(keys[2] == true && ship.getY()>=0)
		{
			ship.move("UP");
		}
		
		if(keys[3] == true && ship.getY()<=480)
		{
			ship.move("DOWN");
		}
		
		if(keys[4] == true && timer>50 && ship.getDraw())
		{
			timer = 0;
			shots.add(new Ammo(ship.getX()+40, ship.getY(),-1));
		}
		
		if((ship.getX()+ship.getWidth()>=alien.getX())&&(ship.getX()<=alien.getX()+alien.getWidth())){
			if((ship.getY()+80>=alien.getY()-5)&&(ship.getY()<=alien.getY()+alien.getHeight())){
				ship.setDraw(false);
			}
		} 
		if((ship.getX()+ship.getWidth()>=alien2.getX())&&(ship.getX()<=alien2.getX()+alien2.getWidth())){
			if((ship.getY()+80>=alien2 .getY()-5)&&(ship.getY()<=alien2.getY()+alien2.getHeight())){
				ship.setDraw(false);
			}
		}
		if(horde.getSize()==0){
			alien.setDraw(false);
			alien2.setDraw(false);
		}
	}


	/**
	 * Method that detects when keys have been pressed and repaints the window.
	 */
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	/**
	 * Method that detects when keys are released and repaints the window.
	 */
	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	/**
	 * Method that would detect if keys are typed.
	 */
	public void keyTyped(KeyEvent e)
	{

	}

	/**
	 * Method that runs the class and continually repaints the window.
	 */
   @SuppressWarnings("static-access")
public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}