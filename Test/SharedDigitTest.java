import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharedDigitTest {

    @Test
    void hasSharedDigit() {

        //Given
        var num1 = SharedDigit.hasSharedDigit(25,15);
        var num2 = SharedDigit.hasSharedDigit(9,99);
        var num3 = SharedDigit.hasSharedDigit(0,0);
        var num4 = SharedDigit.hasSharedDigit(12,23);
        var num5 = SharedDigit.hasSharedDigit(13,22);

        //When

        //Then
        assertTrue(num1);
        assertFalse(num2);
        assertFalse(num3);
        assertTrue(num4);
        assertFalse(num5);


    }
}