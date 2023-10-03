import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitSumTest {

    @Test
    void getEvenDigitSum() {

        //Given
        var num1 = 2_132;
        var num2 = 0;
        var num3 = -2245;
        var num4 = 22045;

        //When
        var evenSum1 = EvenDigitSum.getEvenDigitSum(num1);
        var evenSum2 = EvenDigitSum.getEvenDigitSum(num2);
        var evenSum3 = EvenDigitSum.getEvenDigitSum(num3);
        var evenSum4 = EvenDigitSum.getEvenDigitSum(num4);


        //Then
        Assertions.assertEquals(4, evenSum1);
        Assertions.assertEquals(0, evenSum2);
        Assertions.assertEquals(-1, evenSum3);
        Assertions.assertEquals(8, evenSum4);

    }
}