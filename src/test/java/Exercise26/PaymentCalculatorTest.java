package Exercise26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator paymentCalculator = new PaymentCalculator();

        String actual = paymentCalculator.CalculateMonthsUntilPaidOff(0.000329,5000.0,100.0);
        String expected = "It will take you 70.0 months to pay off this card.";

        assertEquals(actual,expected);
    }
}