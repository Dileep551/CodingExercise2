import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitCheckerTest {

    @Test
    void hasSameLastDigit() {

        assertTrue(LastDigitChecker.hasSameLastDigit(993,13,14));
        assertFalse(LastDigitChecker.hasSameLastDigit(13,0,9999));

    }
}