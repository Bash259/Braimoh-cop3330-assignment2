package Exercise24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class anagramCheckerTest {

    @Test
    void isAnagram_returns_true_for_anagrams() {
        anagramChecker detector = new anagramChecker();

        boolean actual = detector.isAnagram("Bool","Loob");
        boolean expected = true;

        assertEquals(expected,actual);

    }
    @Test
    void isAnagram_returns_false_for_nonanagrams(){
        anagramChecker detector = new anagramChecker();

        boolean actual = detector.isAnagram("Book","Look");
        boolean expected = true;

        assertEquals(expected,actual);
    }
}