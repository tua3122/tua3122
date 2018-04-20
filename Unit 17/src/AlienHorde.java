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

@SuppressWarnings("unused")
public class AlienHorde
{
	private List<Alien> aliens;
	private Graphics win;

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
	
	public int getSize(){
		return aliens.size();
	}

	public String toString()
	{
		return "";
	}
}
