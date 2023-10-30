import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeTest {

    @Test
    void getLargestPrime() {
        // Given (Arrange)
        var number = 21;
        var number1 = 217;
        var number2 = 0;
        var number3 = 45;
        var number4 = -1;
        var number5 = 9985;

        // When (Act)
        var getPrime1 = LargestPrime.getLargestPrime(number);
        var getPrime2 = LargestPrime.getLargestPrime(number1);
        var getPrime3 = LargestPrime.getLargestPrime(number2);
        var getPrime4 = LargestPrime.getLargestPrime(number3);
        var getPrime5 = LargestPrime.getLargestPrime(number4);
        var getPrime6 = LargestPrime.getLargestPrime(number5);

        // Then
        assertEquals(7, getPrime1);
        assertEquals(31, getPrime2);
        assertEquals(-1, getPrime3);
        assertEquals(5, getPrime4);
        assertEquals(-1, getPrime5);
        assertEquals(1997, getPrime6);
    }
}