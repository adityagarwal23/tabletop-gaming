
//-------------------------------------------------------------------------
/**
 *  Army of the people, where they are from, and 
 *  which player's army it is.
 *
 *  @author (adityaagarwal)
 *  @version (2023.10.24)
 */
public class Army
    extends Squad
{
    //~ Fields ................................................................
    private String playerName;
    private String faction;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Army object.
     * @param nameIn is the name it is given
     * @param faction is where they are from
     * @param playerName is the player it belongs to 
     */
    public Army(String nameIn, String faction, String playerName)
    {
        super(nameIn);
        this.faction = faction;
        this.playerName = playerName;
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Gets the playerName
     * @return returns the 
     * newPlayer name it 
     * recieved
     */
    public String getPlayerName()
    {
        return playerName;
    }
    
    /**
     * Sets the player name
     * @param newPlayerName is the getting
     * the new player name
     */
    public void setPlayerName(String newPlayerName)
    {
        this.playerName = newPlayerName;
    }
    
    /**
     * Gets the Faction
     * @return will return the faction
     * it got
     */
    public String getFaction()
    {
        return faction;
    }
    
    /**
     * Sets the new faction that it just got
     * @param newFaction is the faction it 
     * is getting
     */
    public void setFaction(String newFaction)
    {
        this.faction = newFaction;
    }
    
    /**
     * this toString method overrides the original toString
     * and displays the new toString line.
     * @return the playerName, faction, army with
     * the original toString
     */
    public String toString()
    {
        return "player:" + this.playerName 
            + ", " + "faction:" + this.faction 
            + ", " + "army:" + super.toString();
    }
}
