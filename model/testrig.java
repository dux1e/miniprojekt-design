package model;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testrig.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testrig
{
    private model.LP Once;
    private model.LPContainer lPContai1;

    /**
     * Default constructor for test class testrig
     */
    public testrig()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        Once = new model.LP(88888888, "Nemo", "Nightwish", "20202020", "Symfonisk Metal");
        lPContai1 = new model.LPContainer();
        Once.createCopy(22222222, "01031994", 20.20);
        lPContai1.addLP(Once);
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
