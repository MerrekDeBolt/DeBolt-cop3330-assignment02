package ex24;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        App app = new App();
        assertEquals( true, app.isAnagram("tone", "note") );
        assertEquals( false, app.isAnagram("atone", "note") );
    }
}
