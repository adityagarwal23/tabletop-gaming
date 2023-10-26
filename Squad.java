import java.util.*;
//-------------------------------------------------------------------------
/**
 *  This class represents the group of units
 *  that is composed of multiple characters.
 *
 *  @author (adityaagarwal)
 *  @version (2023.10.24)
 */
public class Squad
    extends EnhancedUnit
{
    //~ Fields ................................................................
    private List<Unit> units;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Squad object.
     * @param nameIn is the name that
     * is being given.
     */
    public Squad(String nameIn)
    {
        super(nameIn, 0);
        units = new ArrayList<Unit>();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Gets all of the different units
     * and adds it to the list.
     * @return the amount of units
     * it got
     */
    public List<Unit> getUnits()
    {
        return units;
    }
    
    /**
     * Gets the units that the
     * user is trying to add
     * @param unit is the units
     * it is getting
     */
    public void addUnit(Unit unit)
    {
        units.add(unit);
    }

    /**
     * removes a unit from the 
     * list of the units.
     * @param unit is the units it 
     * will remove
     */
    public void removeUnit(Unit unit)
    {
        units.remove(unit);
    }
    
    /**
     * Gets the points value from 
     * the different units
     * @return is the totalPoints
     * and the new getPoints
     * it is reaching
     */
    public int getPoints()
    {
        int totalPoints = 0;
        for (Unit unit : units)
        {
            totalPoints = totalPoints + unit.getPoints();
        }
        return totalPoints + super.getPoints();
    }
    
    /**
     * Overrides the to string value to 
     * add the units and the different units that
     * were defined in the list.
     * @return is the super string method
     * and the new amount of units
     */
    public String toString()
    {
        return super.toString() + " units:" + this.units;
    }
}
