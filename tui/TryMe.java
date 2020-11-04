package tui;



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
public class TryMe
{
    private model.LP MarvinGaye;
    private model.LP TheBeatles;
    private model.LP Nirvana;
    private model.LPContainer LPSamling;
    private model.Person Joakim;
    private model.Person Kasper;
    private model.Person Dennis;
    private model.PersonContainer Venner;
    private model.Copy Nevermind;
    private model.Copy AbbeyRoad;


    /**
     * Default constructor for test class testrig
     */
    public TryMe()
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
        MarvinGaye = new model.LP(11111111, "Whats Going On", "Marvin Gaye", "1971", "RNB");
        TheBeatles = new model.LP(22222222, "Abbey Road", "The Beatles", "1969", "indie");
        Nirvana = new model.LP(33333333, "Nevermind", "Nirvana", "1991", "Alternative");
        LPSamling = new model.LPContainer();
        LPSamling.addLP(Nirvana);
        LPSamling.addLP(TheBeatles);
        LPSamling.addLP(MarvinGaye);
        Joakim = new model.Person("Joakim", 1234, 0000, "Aalborg", "12345678");
        Kasper = new model.Person("Kasper", 2345, 0000, "Aalborg", "23456789");
        Dennis = new model.Person("Dennis", 3456, 0000, "Aalborg", "34567890");
        Venner = new model.PersonContainer();
        Venner.addPerson(Kasper);
        Venner.addPerson(Dennis);
        Venner.addPerson(Joakim);
        Nevermind = new model.Copy(77777777, "2020", 20.20);
        Nirvana.addCopy(Nevermind);
        AbbeyRoad = new model.Copy(99999999, "2020", 20.20);
        TheBeatles.addCopy(AbbeyRoad);
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