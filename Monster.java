
//-------------------------------------------------------------------------
/**
 *  a monster can have a special rule that represents
 *  a special move, extra resistance to certain opponents, etc. 
 *
 *  @author (adityaagarwal)
 *  @version (2023.10.17)
 */
public class Monster
    extends EnhancedUnit
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Monster object.
     * @param nameIn is the name given
     * @param pointsIn is the amount
     * of points given
     */
    public Monster(String nameIn, int pointsIn)
    {
        super(nameIn, pointsIn);
        super.setQuality(4);
        super.setDefense(4);
        
        /*# Do any work to initialize your class here. */
    }
    

    //~ Methods ...............................................................

}
