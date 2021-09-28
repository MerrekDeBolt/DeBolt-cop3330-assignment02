package ex36;

import ex36.App;
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

        ArrayList<Integer> responses = new ArrayList<Integer>();
        responses.add(100);
        responses.add(200);
        responses.add(1000);
        responses.add(300);

        assertEquals( 400, app.average(responses));
        assertEquals( 100, app.min(responses));
        assertEquals( 1000, app.max(responses));
        assertEquals( "353.55", app.stdAsString(app.std(responses)));
    }
}
