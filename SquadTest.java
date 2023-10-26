import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests for the squad methods
 *
 *  @author (adityaagarwal)
 *  @version (2023.10.24)
 */
public class SquadTest
    extends TestCase
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new SquadTest test object.
     */
    public SquadTest()
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
     * tests the getUnit method to make sure it is
     * getting the proper units
     */
    public void testGetUnits()
    {
        Squad jeff = new Squad("Bob");
        Unit t = new Unit("Flying", 7);
        jeff.addUnit(t);
        assertThat(jeff.getPoints()).isEqualTo(7);
    }
    
    /**
     * tests if the proper units have
     * been added
     */
    public void testAddUnit()
    {
        Squad jeff = new Squad("Bob");
        Unit t = new Unit("Flying", 7);
        jeff.addUnit(t);
        assertThat(jeff.getUnits().size()).isEqualTo(1);
    }
    
    /**
     * tests to make sure the units
     * have been removed
     */
    public void testRemoveUnit()
    {
        Squad jeff = new Squad("Bob");
        Unit t = new Unit("Flying", 7);
        jeff.addUnit(t);
        jeff.removeUnit(t);
        assertThat(jeff.getUnits().size()).isEqualTo(0);
    }
    
    /**
     * tests to make sure it is getting
     * the right amount of points
     */
    public void testGetPoints()
    {
        Squad jeff = new Squad("Bob");
        jeff.setPoints(12);
        assertThat(jeff.getPoints()).isEqualTo(12);
    }
    
    /**
     * tests to make sure
     * that the toString is returning
     * the right value.
     */
    public void testToString()
    {
        Squad jeff = new Squad("Bob");
        Unit t = new Unit("Flying", 7);
        jeff.addUnit(t);
        assertThat(jeff.toString()).isEqualTo("Bob (7, 2, 2) "
            + "units:[Flying (7, 2, 2)]");
        System.out.println(jeff);
    }
}
