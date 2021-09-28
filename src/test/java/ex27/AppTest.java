package ex27;

import ex27.App;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

        assertEquals( true, app.IsStringEmpty(""));
        assertEquals( false, app.IsStringEmpty("J"));

        assertEquals( true, app.IsStringTooShort("J"));
        assertEquals( false, app.IsStringTooShort("John"));

        assertEquals( true, app.IsEIDFormatted("TK-4321"));
        assertEquals( false, app.IsEIDFormatted("A12-1234"));

        assertEquals( true, app.IsZIPValid("55555"));
        assertEquals( false, app.IsZIPValid("ABCDE"));
    }
}
