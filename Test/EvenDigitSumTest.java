import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitSumTest {

    @Test
    void getEvenDigitSum() {

        //Given
        var num1 = 2132;
        var num2 = 0000;
        var num3 = -2245;

        //When
        var evenSum1 = EvenDigitSum.getEvenDigitSum(num1);
        var evenSum2 = EvenDigitSum.getEvenDigitSum(num2);
        var evenSum3 = EvenDigitSum.getEvenDigitSum(num3);


        //Then
        Assertions.assertEquals(4, evenSum1);
        Assertions.assertEquals(0, evenSum2);
        Assertions.assertEquals(-1, evenSum3);

    }
}