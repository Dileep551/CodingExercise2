import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void getGreatestCommonDivisor() {

        //Given
        var num1 = GreatestCommonDivisor.getGreatestCommonDivisor(25,15);
        var num2 = GreatestCommonDivisor.getGreatestCommonDivisor(12,30);
        var num3 = GreatestCommonDivisor.getGreatestCommonDivisor(9,18);
        var num4 = GreatestCommonDivisor.getGreatestCommonDivisor(81,153);

        //When

        //Then
        assertEquals(5, num1);
        assertEquals(6, num2);
        assertEquals(-1, num3);
        assertEquals(9, num4);
    }
}