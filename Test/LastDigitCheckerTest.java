import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitCheckerTest {

    @Test
    void hasSameLastDigit() {

        //Given
        var isLastDigit1 = LastDigitChecker.hasSameLastDigit(993,13,14);
        var isLastDigit2 = LastDigitChecker.hasSameLastDigit(13,0,9999);
        var isLastDigit3 = LastDigitChecker.hasSameLastDigit(-12,13,14);

        //When

        //Then
        assertTrue(isLastDigit1);
        assertFalse(isLastDigit2);
        assertFalse(isLastDigit3);


    }
}