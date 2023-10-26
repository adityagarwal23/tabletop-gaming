import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests the hero class
 *
 *  @author (adityaagarwal)
 *  @version (2023.10.17)
 */
public class HeroTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new HeroTest test object.
     */
    public HeroTest()
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
     * hero class
     */
    public void testConstructor()
    {   
        Hero bob = new Hero("Bob", 12);
        assertEquals("Bob", bob.getName());
        assertEquals(12, bob.getPoints());
        assertEquals(5, bob.getQuality());
        assertEquals(5, bob.getDefense());
    }
}
