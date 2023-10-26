
//-------------------------------------------------------------------------
/**
 *  A special ability might be a bonus that this 
 *  unit provides to other units fighting with it, a 
 *  special move it can perform, extra defense against
 *  certain kinds of opponents,
 *
 *  @author (adityaagarwal)
 *  @version (2023.10.17)
 */
public class EnhancedUnit
    extends Unit
{
    //~ Fields ................................................................
    private String specialRule;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Enhanced object.
     * @param nameIn is the name given
     * @param pointsIn is the points given
     */
    public EnhancedUnit(String nameIn, int pointsIn)
    {
        super(nameIn, pointsIn);
        specialRule = null;
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Gets the special rule value
     * @return gives the special rule
     */
    public String getSpecialRule()
    {
        return specialRule;
    }
    
    /**
     * sets the special rule
     * @param newSpecialRule gives
     * the new value of special rule
     */
    public void setSpecialRule(String newSpecialRule)
    {
        this.specialRule = newSpecialRule;
    }
    
    /**
     * This sto string returns with 
     * the original string if there is a 
     * special rule that has been defined. 
     * @return gives the value of the super
     * string and the special rule.
     */
    public String toString()
    {
        if (this.getSpecialRule() == null)
        {
            return super.toString();
        }
        return super.toString() + " special rule:[" + this.specialRule + "]";
    }
}
