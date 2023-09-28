public class NumberPalindrome {


    public static void main(String[] args) {

        System.out.println(isPalindrome(222));
    }

    public static boolean isPalindrome(int number){

        int revrese = 0;

        int originalNumber = number;

        while(number!= 0){

            int lastDigit = number % 10;

            revrese = (revrese * 10) + lastDigit;

            number /= 10;

        }


        return originalNumber == revrese;
    }

}
