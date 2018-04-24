import javax.swing.JFrame;
import java.awt.Component;

/**
 * A class that initiates the graphics window and runs OuterSpace. 
 * @author tua3122
 */
public class StarFighter extends JFrame
{
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	/**
	 * Method that initializes the window and runs OuterSpace.
	 */
	public StarFighter()
	{
		super("STARFIGHTER");
		setSize(WIDTH,HEIGHT);

		OuterSpace theGame = new OuterSpace();
		((Component)theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);
	}

	/**
	 * Method that runs the constructor.
	 * @param args
	 */
	public static void main( String args[] )
	{
		@SuppressWarnings("unused")
		StarFighter run = new StarFighter();
	}
}