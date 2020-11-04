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
    private model.Loan loan1;
    private model.Copy copy1;
    private model.Person Kasper;
    private model.Copy copy2;

    
    

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
        loan1 = new model.Loan(1, "21212", 12121, true);
        copy1 = new model.Copy(12121, "21212", 20.20);
        Once.addCopy(copy1);
        lPContai1.addLP(Once);
        Kasper = new model.Person("Kasper", 1337, 0000, "Aalborg", "12233445");
        loan1.addCopy(copy1);
        loan1.addPerson(Kasper);
        copy2 = new model.Copy(1337, "Kasper", 20.20);
        Once.addCopy(copy2);
        loan1.addCopy(copy2);
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
