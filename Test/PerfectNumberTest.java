import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    @Test
    void isPerfectNumber() {

        //Given
        var num1 = 6;
        var num2 = 7;
        var num3 = 28;
        var num4 = -1;
        var num5 = 496;

        //When
        var perfectNumber1 = PerfectNumber.isPerfectNumber(6);
        var perfectNumber2 = PerfectNumber.isPerfectNumber(7);
        var perfectNumber3 = PerfectNumber.isPerfectNumber(28);
        var perfectNumber4 = PerfectNumber.isPerfectNumber(-1);
        var perfectNumber5 = PerfectNumber.isPerfectNumber(496);

        //Then
        assertTrue(perfectNumber1);
        assertFalse(perfectNumber2);
        assertTrue(perfectNumber3);
        assertFalse(perfectNumber4);
        assertTrue(perfectNumber5);
    }
}