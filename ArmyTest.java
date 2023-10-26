import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests the methods for the army class
 *
 *  @author (adityaagarwal)
 *  @version (2023.10.24)
 */
public class ArmyTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new ArmyTest test object.
     */
    public ArmyTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        /*# Insert your own setup code here */
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * tests the getterAndsetter for the player
     * name
     */
    public void testGetterAndSetterPlayerName()
    {
        Army bob = new Army("Bob", "Blacksburg", "Jeroo");
        bob.setPlayerName("Jeroo");
        assertThat(bob.getPlayerName()).isEqualTo("Jeroo");
    }
    
    /**
     * Tests the getterAndSetter for faction
     */
    public void testGetterAndSetterFaction()
    {
        Army bob = new Army("Bob", "Blacksburg", "Jeroo");
        bob.setFaction("Blacksburg");
        assertThat(bob.getFaction()).isEqualTo("Blacksburg");
    }
    
    /**
     * tests the toString method
     */
    public void testToString()
    {
        Army bob = new Army("Bob", "Blacksburg", "Jeroo");
        assertThat(bob.toString()).isEqualTo("player:Jeroo, "
            + "faction:Blacksburg, army:Bob (0, 2, 2) units:[]");
        System.out.println(bob);
    }
}
