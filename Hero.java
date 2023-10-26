
//-------------------------------------------------------------------------
/**
 *   The heroes can boost the capabilities of other units 
 *   close to them, so their "special rule" 
 *   often includes modifiers 
 *   for nearby units.
 *
 *  @author (adityaagarwal)
 *  @version (2023.10.17)
 */
public class Hero
    extends EnhancedUnit
{
    //~ Fields ...............................................................
    


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Hero object.
     * @param nameIn is the name given
     * @param pointsIn is the amount of
     * points given
     */
    public Hero(String nameIn, int pointsIn)
    {
        super(nameIn, pointsIn);
        super.setQuality(5);
        super.setDefense(5);
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................

}
