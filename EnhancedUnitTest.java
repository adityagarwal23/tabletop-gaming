import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests for enhanced unit
 *
 *  @author (adityaagarwal)
 *  @version (2023.10.17)
 */
public class EnhancedUnitTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new EnhancedUnitTest test object.
     */
    public EnhancedUnitTest()
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
     * tests the getter and 
     * setter for special rule
     */
    public void testSpecialRule()
    {
        EnhancedUnit bob = new EnhancedUnit("Bob", 12);
        bob.setSpecialRule("Flying");
        assertThat(bob.getSpecialRule()).isEqualTo("Flying");
    }
    
    /**
     * tests the constructor
     */
    public void testConstructor()
    {
        EnhancedUnit bob = new EnhancedUnit("Bob", 12);
        assertEquals("Bob", bob.getName());
        assertEquals(12, bob.getPoints());
        assertEquals(2, bob.getQuality());
        assertEquals(2, bob.getDefense());
        assertEquals(null, bob.getSpecialRule());
    }
    
    /**
     * tests the toString method
     * when it is null
     */
    public void testToStringNull()
    {
        EnhancedUnit bob = new EnhancedUnit("Bob", 12);
        assertThat(bob.toString()).isEqualTo("Bob (12, 2, 2)");
        System.out.println(bob);
    }
    
    /**
     * tests the toString method
     * when it is not null
     */
    public void testToStringNullFalse()
    {
        EnhancedUnit bob = new EnhancedUnit("Bob", 12);
        bob.setSpecialRule("Flying");
        assertThat(bob.toString()).isEqualTo("Bob (12, "
            + "2, 2) special rule:[Flying]");
    }
}
