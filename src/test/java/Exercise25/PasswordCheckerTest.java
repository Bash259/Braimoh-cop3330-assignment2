package Exercise25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void Password_Strength_very_strong_test() {
        PasswordChecker passwordChecker = new PasswordChecker();

        String actual = passwordChecker.passwordStrength("Fouad12!@");
        String expected = "The password 'Fouad12!@' is a very strong password.";

        assertEquals(expected,actual);
    }
    @Test
    void Password_Strength_strong_test() {
        PasswordChecker passwordChecker = new PasswordChecker();

        String actual = passwordChecker.passwordStrength("Fouad1234");
        String expected = "The password 'Fouad1234' is a strong password.";

        assertEquals(expected,actual);
    }
}