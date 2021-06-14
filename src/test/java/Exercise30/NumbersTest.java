package Exercise30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void numbersA() {
        Numbers test = new Numbers();

        String actual = test.NumbersA(1);
        String expected = "1 2 3 4 5 6 7 8 9 10 11 12";

        assertEquals(actual,expected);

    }
}