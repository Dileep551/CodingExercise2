public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        int lastDigitNum1 = 0;
        int lastDigitNum2 = 0;
        int lastDigitNum3 = 0;

        if(isValid(num1) && isValid(num2)&& isValid(num3)){

           lastDigitNum1 = num1 % 10;
           lastDigitNum2 = num2 % 10;
           lastDigitNum3 = num3 % 10;

            return lastDigitNum1 == lastDigitNum2 || lastDigitNum2 == lastDigitNum3 || lastDigitNum1 == lastDigitNum3;


        }
        return false;
    }

    public static boolean isValid(int num){

        return num >= 10 && num <= 1000;
    }
}
