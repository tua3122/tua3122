import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that stores, moves, and renders the fired bullets .
 * @author tua3122
 *
 */
@SuppressWarnings("unused")
public class Bullets
{
	private List<Ammo> ammo;

	/**
	 * Constructor that initiates the ArrayList ammo.
	 */
	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	/**
	 * Method that adds Ammo objects to the ArrayList ammo.
	 * @param al
	 */
	public void add(Ammo al)
	{
		ammo.add(al);
	}
	
	/**
	 * Method that draws the ammo on the window.
	 * @param window the window the bullets will be drawn on.
	 */
	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i < ammo.size(); i++){
			window.setColor(Color.YELLOW);
			window.fillRect(ammo.get(i).getX(), ammo.get(i).getY(), 5, 5);
		}
	}

	/**
	 * Method that changes the y-position of all bullets based on their position and their speed.
	 */
	public void moveEmAll()
	{
		for(int i = 0; i < ammo.size(); i++){
			ammo.get(i).setY(ammo.get(i).getY()+ammo.get(i).getSpeed());
			
		}
	}

	/**
	 * Method that interprets if the bullets have hit an alien and detects if they have reached the boundary.
	 * Removes them from the list and covers them up so they will not interfere with the game.
	 * @param window the window the bullets are on.
	 */
	public void cleanEmUp(Graphics window)
	{
		for(int i = 0; i < ammo.size(); i++){
			if(ammo.get(i).getY()<-5){
				ammo.get(i).setSpeed(0);
			}
			window.setColor(Color.black);
			window.fillRect(ammo.get(i).getX(), ammo.get(i).getY(), 5, 7);
			if(ammo.get(i).getSpeed()==0){
				window.setColor(Color.black);
				window.fillRect(ammo.get(i).getX(), ammo.get(i).getY(), 5, 7);
				ammo.remove(i);
			}
		}
		
	}

	/**
	 * Method that returns the list of ammo.
	 * @return the ArrayList ammo.
	 */
	public List<Ammo> getList()
	{
		return ammo;
	}

	/**
	 * Method that returns an empty string.
	 */
	public String toString()
	{
		return "";
	}
}
