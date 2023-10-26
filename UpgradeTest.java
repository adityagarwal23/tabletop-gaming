import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  These are the test methods for 
 *  the upgrade class
 *
 *  @author (adityaagarwal)
 *  @version (2023.10.17)
 */
public class UpgradeTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new UpgradeTest test object.
     */
    public UpgradeTest()
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
     * Tests the getter and setter
     * for the name
     */
    public void testGetterAndSetterName()
    {
        Upgrade bob = new Upgrade("Bob", 12);
        bob.setName("Hokie");
        assertThat(bob.getName()).isEqualTo("Hokie");
    }
    
    /**
     * tests the getter and setter
     * for the points
     */
    public void testGetterAndSetterPoints()
    {
        Upgrade bob = new Upgrade("Bob", 12);
        bob.setPoints(12);
        assertThat(bob.getPoints()).isEqualTo(12);
    }
    
    /**
     * tests the constructor by
     * using multiple assert statements
     */
    public void testConstructor()
    {
        Upgrade bob = new Upgrade("Bob", 12);
        assertEquals("Bob", bob.getName());
        assertEquals(12, bob.getPoints());
    }
    
    /**
     * Tests the toString method to 
     * make sure it is displaying the
     * toString currently.
     */
    public void testToString()
    {
        Upgrade power = new Upgrade("Bob", 12);
        assertThat(power.toString()).isEqualTo("Bob (12)");
        System.out.println(power);
    }
}
