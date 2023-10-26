import java.util.*;
//-------------------------------------------------------------------------
/**
 *  This class represents any kind of playable 
 *  unit in the game,
 *  and will define the features 
 *  that all units have in common. 
 *
 *  @author (adityaagarwal)
 *  @version (2023.10.17)
 */
public class Unit
    implements GameElement
{
    //~ Fields ................................................................
    private String name;
    private int points;
    private int quality;
    private int defense;
    private List<Upgrade> upgrades;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Unit object.
     * @param nameIn is the name given
     * @param pointsIn is the points given
     */
    public Unit(String nameIn, int pointsIn)
    {
        super();
        name = nameIn;
        points = pointsIn;
        quality = 2;
        defense = 2;
        upgrades = new ArrayList<Upgrade>();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Get this GameElement's name.
     *
     * @return This object's name as a string.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Sets the name of game element
     * @param newName is the new name
     * being assigned
     */
    public void setName(String newName)
    {
        this.name = newName;
    }


    // ----------------------------------------------------------
    /**
     * Get this GameElement's cost in points.
     *
     * @return The number of points for this object.
     */
    public int getPoints()
    {
        int totalPoints = 0;
        for (Upgrade upgrade : upgrades)
        {
            totalPoints = totalPoints + upgrade.getPoints();
        }
        return totalPoints + points;
    }
    
    /**
     * sets the game elements points
     * @param newPoints is the new points given
     */
    public void setPoints(int newPoints)
    {
        this.points = newPoints;
    }
    
    /**
     * gets the quality number
     * @return quality that it got
     */
    public int getQuality()
    {
        return quality;
    }
    
    /**
     * Sets the quality number
     * @param newQuality is the new
     * quality number
     */
    public void setQuality(int newQuality)
    {
        this.quality = newQuality;
    }
    
    /**
     * Gets the defense number
     * @return defense number 
     * is the output
     */
    public int getDefense()
    {
        return defense;
    }
    
    /**
     * Sets the defense number
     * @param newDefense number
     * is given
     */
    public void setDefense(int newDefense)
    {
        this.defense = newDefense;
    }
    
    /**
     * Grabs the array list of the
     * different upgrades
     * @return upgrades is the amount 
     * of upgrades
     */
    public List<Upgrade> getUpgrades()
    {
        return upgrades;
    }
    
    /**
     * Allows the different
     * upgrades so that it can be added 
     * to the list of the upgrades
     * @param upgrade is the upgrade
     * that it should have
     * 
     */
    public void addUpgrade(Upgrade upgrade)
    {
        upgrades.add(upgrade);
    }
    
    /**
     * Allows the upgrades to be removed
     * from the list of the upgrades
     * @param upgrade is the upgrade that
     * will be removed.
     */
    public void removeUpgrade(Upgrade upgrade)
    {
        upgrades.remove(upgrade);
    }
    
    /**
     * The toString is the string that
     * is being overriden so the user gets the
     * right sentence depending on if there are 
     * upgrades.
     * @return is the data it will give
     * depending on the size of upgrades
     */
    public String toString()
    {
        String data = this.getName() + " (" + this.getPoints()
            + ", " + this.getQuality() + ", " +
            this.getDefense() + ")";
        if (this.getUpgrades().size() == 0)
        {
            return data;
        }
        return data + " upgrades:" + upgrades;
    }

}
