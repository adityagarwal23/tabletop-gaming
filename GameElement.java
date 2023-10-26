
//-------------------------------------------------------------------------
/**
 *  Runs the application for the game
 *
 *  @author (adityaagarwal)
 *  @version (2023.10.17)
 */
public interface GameElement
{
    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get this GameElement's name.
     *
     * @return This object's name as a string.
     */
    public String getName();


    // ----------------------------------------------------------
    /**
     * Get this GameElement's cost in points.
     *
     * @return The number of points for this object.
     */
    public int getPoints();
    
}
