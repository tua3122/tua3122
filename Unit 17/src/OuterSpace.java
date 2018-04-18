//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

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

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private Ammo ammo;
	private int timer;
	

	private AlienHorde horde;
	private Bullets shots;	

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		timer = 0;
		setBackground(Color.black);

		keys = new boolean[5];
		ship = new Ship(350, 450, 2);
		horde = new AlienHorde(48);
		//alienOne = new Alien(20, 20, 1);
		//alienTwo = new Alien(100, 20, 1);
		ammo = new Ammo(-10,-10,0);
		shots = new Bullets();
		shots.add(new Ammo(-10,-10,0));

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		timer++;
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;
		//alienOne.draw(window);
		//alienTwo.draw(window);
		ship.draw(window);
		
		shots.cleanEmUp(window);
		shots.moveEmAll();
		shots.drawEmAll(window);
		
		horde.moveEmAll();
		horde.drawEmAll(window);
		
		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null){
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));
		}
		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		

		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		
		if(keys[2] == true)
		{
			ship.move("UP");
		}
		
		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		
		if(keys[4] == true && timer>50)
		{
			timer = 0;
			shots.add(new Ammo(ship.getX()+40, ship.getY(),-1));
			//ammo = new Ammo(ship.getX()+40, ship.getY(),-1);
		}
		
		/*if(alienTwo.getX()>=725||alienOne.getX()<=-15){
			alienOne.move("LEFT");
			alienOne.setSpeed(-alienOne.getSpeed());
			alienTwo.move("LEFT");
			alienTwo.setSpeed(-alienTwo.getSpeed());
			alienOne.setY(alienOne.getY()+3);
			alienTwo.setY(alienTwo.getY()+3);
		}
		else{
			alienOne.move("RIGHT");
			alienTwo.move("RIGHT");
		}*/
		//add in collision detection
		
		/*for(int i = 0; i < shots.getList().size(); i++){
			if((shots.getList().get(i).getX()>=alienOne.getX()&&shots.getList().get(i).getX()<=alienOne.getX()+20)&&shots.getList().get(i).getY()==alienOne.getY()){
				alienOne.setPos(-100, -100);
			}
		}*/

		//causes flickering
		//twoDGraph.drawImage(back, null, 0, 0);
	}


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

	public void keyTyped(KeyEvent e)
	{

	}

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

/*if(shots.size()>0){
for(int i = 0; i < shots.size(); i++){
window.setColor(Color.BLACK);
window.fillRect(shots.get(i).getX(), shots.get(i).getY(), 5, 5);
shots.get(i).setPos(shots.get(i).getX(), shots.get(i).getY()+shots.get(i).getSpeed());
shots.get(i).draw(window);
if(shots.get(i).getY()<-5){
	shots.get(i).setSpeed(0);
}
}
}*/