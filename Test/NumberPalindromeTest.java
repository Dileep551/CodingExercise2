import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPalindromeTest {

    @Test
    void isPalindrome() {

        //Given
        var number = 121;

        //When
        var palindromeNumber = NumberPalindrome.isPalindrome(number);

        //Then
        assertTrue(palindromeNumber);

    }
}