/**
 * Interface to describe a locatable object. A locatable object
 * can have a x-coordinate and a y-coordinate. The position and
 * the individual coordinates can be set. The individual coordinates
 * can be returned.
 *  
 * @author tua3122
 */
public interface Locatable
{
    public void setPos( int x, int y);
    public void setX( int x );
    public void setY( int y );

    public int getX();
    public int getY();
}
