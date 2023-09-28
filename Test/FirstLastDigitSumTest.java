import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLastDigitSumTest {

    @Test
    void sumFirstAndLastDigit() {
        // Given (Arrange)
        var number = 364;
        var number1 = 0;
        var number2 = -22;

        // When (Act)
        var sum = FirstLastDigitSum.sumFirstAndLastDigit(number);
        var sum1 = FirstLastDigitSum.sumFirstAndLastDigit(number1);
        var sum2 = FirstLastDigitSum.sumFirstAndLastDigit(number2);

        // Then
        assertEquals(7, sum);
        assertSame(0, sum1);
        assertSame(-1, sum2);
    }
}