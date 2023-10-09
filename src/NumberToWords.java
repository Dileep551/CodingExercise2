public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(4);
    }
    public static void numberToWords(int num){

        if(num < 0){
            System.out.println("Invalid Value");
        }

        int reverseNum = reverse(num);
        int getDigitReverseNum = getDigitCount(reverseNum);



        while(reverseNum > 0) {

            int lastDigit = reverseNum % 10;

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

            } else  {
                System.out.println("Nine");

            }

            reverseNum /= 10;

        }

        int actualDigit = getDigitCount(num);
        int diffDigit = actualDigit - getDigitReverseNum;
        if(diffDigit == 0 && num == 0){
            System.out.println("Zero");
        }
        else{

            for(int i = 0; i < diffDigit; i++ ){

                System.out.println("Zero");


            }

        }
    }


    public static int reverse(int number){

        int revrese = 0;

        while(number!= 0){

            int lastDigit = number % 10;

            revrese = (revrese * 10) + lastDigit;

            number /= 10;

        }
        return revrese;

    }

    public static int getDigitCount(int number) {

        if (number < 0) {

            return -1;
        } else if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number != 0){
            count++;
            number /= 10;

        }
        return count;
    }
}