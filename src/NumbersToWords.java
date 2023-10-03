public class NumbersToWords {

    public static void main(String[] args) {
        numbersToWords(100);
    }

    public static void numbersToWords(int num){

        if(num < 0){
            System.out.println("Invalid Value");
        }

        while(num > 0) {

            int lastDigit = num % 10;
            if (lastDigit == 0) {
                System.out.println("Zero");

            } else if (lastDigit == 1) {

                System.out.println("One");

            } else if (lastDigit == 2) {

                System.out.println("Two");

            } else if (lastDigit == 3) {

                System.out.println("Three");

            } else if (lastDigit == 4) {

                System.out.println("Four");

            } else if (lastDigit == 5) {

                System.out.println("Five");

            } else if (lastDigit == 6) {

                System.out.println("Six");

            } else if (lastDigit == 7) {

                System.out.println("Seven");

            } else if (lastDigit == 8) {

                System.out.println("Eight");

            } else if (lastDigit == 9) {
                System.out.println("Nine");

            }

            num /= 10;

        }

    }

    public static int reverse(int number){

        return 1;

    }

    public static int getDigitCount(int number){

        if(number < 0){

            return -1;
        }
        return 1;
    }

}
