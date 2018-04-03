//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import java.awt.Component;

@SuppressWarnings("serial")
public class TheGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 560;

	public TheGame()
	{
		super("PONG");
		setSize(WIDTH,HEIGHT);
		
		Pong game = new Pong();
		
		((Component)game).setFocusable(true);			
		getContentPane().add(game);
						
		setVisible(true);
	}
	
	@SuppressWarnings("unused")
	public static void main( String args[] )
	{
		TheGame run = new TheGame();
	}
}