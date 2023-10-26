import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests for the monster class
 *
 *  @author (adityaagarwal)
 *  @version (2023.10.17)
 */
public class MonsterTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new MonsterTest test object.
     */
    public MonsterTest()
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
     * tests for the constructor in the
     * monster class
     */
    public void testConstructor()
    {   
        Monster bob = new Monster("Bob", 12);
        assertEquals("Bob", bob.getName());
        assertEquals(12, bob.getPoints());
        assertEquals(4, bob.getQuality());
        assertEquals(4, bob.getDefense());
    }
}
