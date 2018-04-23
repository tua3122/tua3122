import java.awt.Color;
import java.awt.Graphics;
/*import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;*/
import java.util.ArrayList;
import java.util.List;

/**
 * A class that generates the alien horde the starfighter must destroy. Uses aliens from the Alien class.
 * Aliens move side to side and advance. They are removed if ammo from the starfighter hits them.
 * 
 * @author tua3122
 */
public class AlienHorde
{
	private List<Alien> aliens;
	private Graphics win;

	/**
	 * Constructor that creates the alien horde with the 
	 * aliens spread out and incremented to avoid overlapping.
	 * @param size that indicates how many aliens are in the horde.
	 */
	public AlienHorde(int size)
	{
		int x = 5, y = 5;
		aliens = new ArrayList<Alien>();
		for(int i = 0; i < size; i ++){
			add(new Alien(x, y, 1));
			x+=49;
			if(aliens.size() % 16==0){
				x=5;
				y+=40;
			}
		}
	}

	/**
	 * Method that adds an alien to the horde.
	 * @param al the alien that is being added.
	 */
	public void add(Alien al)
	{
		aliens.add(al);
	}

	/**
	 * Method that renders all the aliens in the horde.
	 * @param window the window the alien horde is drawn on.
	 */
	public void drawEmAll( Graphics window )
	{
		win = window;
		for(int i = 0; i < aliens.size(); i++){
			aliens.get(i).draw(window);
			if(aliens.get(i).getX()==755){
				window.setColor(Color.BLACK);
				window.fillRect(aliens.get(i).getX(), aliens.get(i).getY(), 50, 50);
			}
			if(aliens.get(i).getSpeed()==0){
				window.setColor(Color.BLACK);
				window.fillRect(aliens.get(i).getX(), aliens.get(i).getY(), 40, 40);
			}
		}
		
	}

	/**
	 * Method that moves the aliens horizontally across the window.
	 * Moves the aliens forwards when they reach the right boundary.
	 */
	public void moveEmAll()
	{
		for(int i = 0; i < aliens.size(); i++){
			if(aliens.get(i).getSpeed()==0){
				aliens.get(i).setY(-100);
			}
			if(aliens.get(i).getX()==755){
				aliens.get(i).setPos(750,aliens.get(i).getY()+40);
				aliens.get(i).setSpeed(-aliens.get(i).getSpeed());
			}
			else if(aliens.get(i).getX()==-15){
				aliens.get(i).setX(0);
				aliens.get(i).setSpeed(-aliens.get(i).getSpeed());
			}
			else{
				aliens.get(i).move("LEFT");
			}
		}
		
	}

	/**
	 * Method that detects if a shot hits an alien then removes and covers the hit alien.
	 * @param shots represents the shots that have been fired and can kill aliens.
	 */
	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int i = 0; i < shots.size(); i++){
			for(int j = 0; j < aliens.size(); j++){
				if((shots.get(i).getX()>=aliens.get(j).getX()-5)&&(shots.get(i).getX()<=aliens.get(j).getX()+aliens.get(j).getWidth()+5)){
					if((shots.get(i).getY()>=aliens.get(j).getY()-5)&&(shots.get(i).getY()<=aliens.get(j).getY()+aliens.get(j).getHeight()+5)){
						aliens.get(j).setSpeed(0);
						win.setColor(Color.BLACK);
						win.fillRect(aliens.get(j).getX(), aliens.get(j).getY(), 40, 40);
						aliens.remove(j);
						shots.get(i).setSpeed(0);
					}
				}
			}
		}
	}
	
	/**
	 * Method that returns the size of the alien horde. 
	 * @return the integer size of the horde.
	 */
	public int getSize(){
		return aliens.size();
	}

	/**
	 * Method that returns an empty string.
	 */
	public String toString()
	{
		return "";
	}
}
