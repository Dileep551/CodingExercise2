public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(22, 12));
    }

    public static boolean hasSharedDigit(int num1, int num2){

        int num1Digit = 0;
        int num2Digit = 0;

        if(num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99){

            for(int i = num1; i > 0; i%=10)
                    for(int j = num2; j > 0; j%=10){

                        System.out.println(i +"  "+j);

                        if(i == j){

                            return true;
                        }

                    }
            }

        else
            return false;
        return false;
    }

}
