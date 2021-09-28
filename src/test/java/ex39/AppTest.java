package ex39;

import ex39.App;
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

        int[] origArray = {1,2,3,4,5,6,7,8};
        int[] evenNums = app.filterEvenNumbers(origArray);

        assertEquals(evenNums[0], 2);
        assertEquals(evenNums[1], 4);
        assertEquals(evenNums[2], 6);
        assertEquals(evenNums[3], 8);
    }
}
