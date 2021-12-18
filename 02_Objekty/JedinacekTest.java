

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class JedinacekTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class JedinacekTest
{
    /**
     * Default constructor for test class JedinacekTest
     */
    public JedinacekTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testPristupu(){
        Jedinacek jedinacek = Jedinacek.getJedinacek();
        jedinacek.setJmeno("Mistr Luba");
        assertTrue("Mistr Luba".equals(jedinacek.getJmeno()));
        
        Jedinacek jedinacek2 = Jedinacek.getJedinacek();
        assertTrue("Mistr Luba".equals(jedinacek2.getJmeno()));
    }
}
