/**
 * Interface to describe a moveable object. A moveable object
 * can have a x-coordinate and a y-coordinate. The position and
 * the individual coordinates can be set. The individual coordinates
 * can be returned. The moveable object has a width and height that can
 * be similarly set and returned. The moveable object has a speed
 * that can also be set and returned.
 *  
 * @author tua3122
 */
public interface Moveable
{
    public void setPos( int x, int y);
    public void setX( int x );
    public void setY( int y );

    public int getX();
    public int getY();

	public int getWidth();
	public int getHeight();
	public void setWidth( int w );
	public void setHeight( int h );

    public void setSpeed( int s );
	public int getSpeed();
}
