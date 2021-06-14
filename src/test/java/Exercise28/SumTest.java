package Exercise28;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    @DisplayName("1 + 2 + 3 + 4 + 5")
    void sum() {
        Sum Add = new Sum();
        String actual = Add.SumA();
        String expected = "The total is 15";

        assertEquals(actual,expected);
    }
}