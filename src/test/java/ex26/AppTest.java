package ex26;

import ex26.App;
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

        PaymentCalculator calc = new PaymentCalculator();
        calc.balance = 5000;
        calc.APR = 12;
        calc.monthlyPayment = 100;

        assertEquals( 70, calc.calculateMonthsUntilPaidOff());
    }
}
