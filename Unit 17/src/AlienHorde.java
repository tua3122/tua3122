//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

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

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i < aliens.size(); i++){
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		for(int i = 0; i < aliens.size(); i++){
			//aliens.get(i).setY(aliens.get(i).getY()+aliens.get(i).getSpeed());
			if(aliens.get(i).getX()>=725||aliens.get(i).getX()<=-15){
				aliens.get(i).move("LEFT");
				aliens.get(i).setSpeed(-aliens.get(i).getSpeed());
				aliens.get(i).setY(aliens.get(i).getY()+3);
			}
			else{
				aliens.get(i).move("RIGHT");
			}
		}
		
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
	}

	public String toString()
	{
		return "";
	}
}
