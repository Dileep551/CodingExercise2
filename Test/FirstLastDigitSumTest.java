import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLastDigitSumTest {

    @Test
    void sumFirstAndLastDigit() {
        // Given (Arrange)
        var number = 364;
        var number1 = 0;
        var number2 = -22;
        var number3 = 2000002;

        // When (Act)
        var sum = FirstLastDigitSum.sumFirstAndLastDigit(number);
        var sum1 = FirstLastDigitSum.sumFirstAndLastDigit(number1);
        var sum2 = FirstLastDigitSum.sumFirstAndLastDigit(number2);
        var sum3 = FirstLastDigitSum.sumFirstAndLastDigit(number3);

        // Then
        assertEquals(7, sum);
        assertEquals(0, sum1);
        assertEquals(-1, sum2);
        assertEquals(4, sum3);
    }
}