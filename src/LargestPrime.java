public class LargestPrime {

    public static int getLargestPrime(int number) {
        int i;

        if (number > 1) {
            for (i = 2; i <= number; i++) {
                if (number % i == 0) {
                    number = number / i;
                    i--;
                }

            }
            return i;
        }
        return -1;
    }

}
