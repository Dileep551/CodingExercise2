import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToWordsTest {

    @Test
    void getDigitCount() {
        //Give
        var num = 1245;

        //When
        var value = NumberToWords.getDigitCount(num);

        //Then
        assertEquals(4, value);
        assertEquals(2, NumberToWords.getDigitCount(45));
        assertEquals(-1, NumberToWords.getDigitCount(-45));
        assertEquals(1, NumberToWords.getDigitCount(0));
        assertEquals(3, NumberToWords.getDigitCount(100));
    }
}