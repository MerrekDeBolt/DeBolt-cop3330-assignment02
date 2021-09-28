package ex29;

import ex29.App;
import org.junit.Test;

import java.util.ArrayList;

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

        assertEquals( -1, app.validReturn("0"));
        assertEquals( -1, app.validReturn("ABC"));
        assertEquals( 18, app.getYears(4));
    }
}
