
//-------------------------------------------------------------------------
/**
 *  The upgrade class to help the object
 *  upgrade by using points
 *  
 *  @author (adityaagarwal)
 *  @version (2023.10.17)
 */
public class Upgrade
    implements GameElement
{
    //~ Fields ................................................................
    private String name;
    private int points;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Upgrade object.
     * @param nameIn is the name given
     * @param pointsIn is the amount of
     * points given
     */
    public Upgrade(String nameIn, int pointsIn)
    {
        super();
        name = nameIn;
        points = pointsIn;
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Gets the name, it has to
     * be a string value
     * @return gives name value
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * sets those names once it 
     * has gotten the name
     * @param newName gets the
     * new name
     * string
     */
    public void setName(String newName)
    {
        this.name = newName;    
    }
    
    /**
     * gets the points, an int 
     * value
     * @return the amount of points
     */
    public int getPoints()
    {
        return points;
    }
    
    /**
     * sets the value of 
     * those points
     * @param newPoints takes in the newPoints
     * that were given
     */
    public void setPoints(int newPoints)
    {
        this.points = newPoints;
    }
    
    /**
     * Overrides the toString method
     * with adding the name
     * and the points together
     * @return data of name and points
     */
    public String toString()
    {
        String data = this.name + " (" + this.points + ")";
        return data;
    }

}
