import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPalindromeTest {

    @Test
    void isPalindrome() {

        //Given
        var number = 121;
        var number1 = 122;
        var number2 = 0;
        var number3 = -22;

        //When
        var palindromeNumber = NumberPalindrome.isPalindrome(number);
        var palindromeNumber1 = NumberPalindrome.isPalindrome(number1);
        var palindromeNumber2 = NumberPalindrome.isPalindrome(number2);
        var palindromeNumber3 = NumberPalindrome.isPalindrome(number3);

        //Then
        assertTrue(palindromeNumber);
        assertFalse(palindromeNumber1);
        assertTrue(palindromeNumber2);
        assertTrue(palindromeNumber3);

    }
}