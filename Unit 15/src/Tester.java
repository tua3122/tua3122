//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import java.awt.Component;

public class Tester extends JFrame
{
	//cut down to size
	private static final int WIDTH = 590; //800
	private static final int HEIGHT = 500; //500

	public Tester()
	{
		super("PONG TESTER");
		setSize(WIDTH,HEIGHT);
		
		//getContentPane().add(new BlockTestTwo());		
		
		//getContentPane().add(new BallTestTwo());		
		
		PaddleTestTwo padTest = new PaddleTestTwo();
		((Component)padTest).setFocusable(true);			
		getContentPane().add(padTest);
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		Tester run = new Tester();
	}
}