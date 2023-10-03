import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitCheckerTest {

    @Test
    void hasSameLastDigit() {

        //Given
        var num1 = LastDigitChecker.hasSameLastDigit(993,13,14);
        var num2 = LastDigitChecker.hasSameLastDigit(13,0,9999);
        var num3 = LastDigitChecker.hasSameLastDigit(-12,13,14);

        //When

        //Then
        assertTrue(num1);
        assertFalse(num2);
        assertFalse(num3);


    }
}