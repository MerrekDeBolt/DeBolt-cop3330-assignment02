package ex25;

import ex25.App;
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
        assertEquals( 1, app.passwordValidator("12345") );
        assertEquals( 2, app.passwordValidator("abcdef") );
        assertEquals( 3, app.passwordValidator("abc123xyz") );
        assertEquals( 4, app.passwordValidator("1337h@xor!") );
    }
}
