public class EvenDigitSum {
    public static int getEvenDigitSum(int number){

        int digit = 0;

        int sumEvenDigit = 0;

        if(number < 0){

            return -1;
        }

        while(number > 0){

            digit = number % 10;

            number = number / 10;

            if(digit % 2 == 0){

                sumEvenDigit += digit;

            }

        }

        return sumEvenDigit;

    }


}
