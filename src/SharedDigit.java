public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {

        if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {

            int num1l = num1 / 10;
            int num1r = num1 % 10;
            int num2l = num2 / 10;
            int num2r = num2 % 10;

            if(num1l == num2l || num1l == num2r || num1r == num2l || num1r == num2r){

                return true;
            }

        }

        return false;
    }

}