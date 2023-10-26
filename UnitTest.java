import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests the methods
 *  for the unit class
 *
 *  @author (adityaagarwal)
 *  @version (2023.10.17)
 */
public class UnitTest
    extends TestCase
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new UnitTest test object.
     */
    public UnitTest()
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
     * for the name method
     */
    public void testGetterAndSetterName()
    {
        Unit bob = new Unit("Bob", 12);
        bob.setName("Hokie");
        assertThat(bob.getName()).isEqualTo("Hokie");
    }
    
    /**
     * test the getter and setter
     * for the points method
     */
    public void testGetterAndSetterPoints()
    {
        Unit bob = new Unit("Bob", 12);
        bob.setPoints(12);
        assertThat(bob.getPoints()).isEqualTo(12);
    }
    
    /**
     * Tests the getter and setter
     * for the quality method
     */
    public void testGetterAndSetterQuality()
    {
        Unit bob = new Unit("Bob", 12);
        bob.setQuality(5);
        assertThat(bob.getQuality()).isEqualTo(5);
    }
    
    /**
     * Tests the getter and setter
     * for the defense method
     */
    public void testGetterAndSetterDefense()
    {
        Unit bob = new Unit("Bob", 12);
        bob.setDefense(5);
        assertThat(bob.getDefense()).isEqualTo(5);
    }
    
    /**
     * Tests the constructor to 
     * make sure all the values 
     * are asserting to be true.
     */
    public void testConstructor()
    {
        Unit bob = new Unit("Bob", 12);
        
        assertEquals("Bob", bob.getName());
        assertEquals(12, bob.getPoints());
        assertEquals(2, bob.getQuality());
        assertEquals(2, bob.getDefense());
        
    }
    
    /**
     * Tests the getUpgrade method to make sure
     * the upgrade is working
     */
    public void testGetUpgrade()
    {
        Unit upgrade = new Unit("Bob", 12);
        Upgrade t = new Upgrade("Flying", 7);
        upgrade.addUpgrade(t);
        assertThat(upgrade.getUpgrades().size()).isEqualTo(1);
        assertThat(upgrade.getPoints()).isEqualTo(19);
    }
        
    /**
     * Tests the addUpgrade method to make sure the 
     * new upgrades are being added.
     */
    public void testAddUpgrade()
    {
        Unit upgrade = new Unit("Bob", 12);
        Upgrade sword = new Upgrade("sword" , 12);
        upgrade.addUpgrade(sword);
        assertThat(upgrade.getUpgrades().size()).isEqualTo(1);
    }
    
    /**
     * Tests the removeUpgrade method to make sure the 
     * new upgrade that was added then removed is 
     * actually removed.
     */
    public void testRemoveUpgrade()
    {
        Unit upgrade = new Unit("Bob", 12);
        Upgrade sword = new Upgrade("sword" , 12);
        upgrade.addUpgrade(sword);
        upgrade.removeUpgrade(sword);
        assertThat(upgrade.getUpgrades().size()).isEqualTo(0);
    }
    
    /**
     * Tests the listToString method to make sure
     * that the when it doesn't recieve any upgrades
     * it's not adding any upgrades
     */
    public void testListToString()
    {
        Unit upgrade = new Unit("Bob", 12);
        assertThat(upgrade.toString()).
            isEqualTo("Bob (12, 2, 2)");
        System.out.println(upgrade);
    }
    
    /**
     * Tests the ToString method to make sure when an upgrade
     * is added it is able to added to the existing unit. 
     */
    public void testListUpgradesToString()
    {
        Unit upgrade = new Unit("Bob", 12);
        Upgrade test = new Upgrade("Fly", 12);
        upgrade.addUpgrade(test);
        assertThat(upgrade.toString()).isEqualTo("Bob "
            + "(24, 2, 2) upgrades:[Fly (12)]");
        System.out.println(upgrade);
    }
}
