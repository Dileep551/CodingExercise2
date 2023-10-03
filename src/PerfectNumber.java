public class PerfectNumber {

    public static boolean isPerfectNumber(int number){

        if(number < 1){
            return false;
        }
        else{
            int value = 1;
            int totalValue = 0;
            while (number > value){

                if(number % value == 0){
                    totalValue += value;
                }
                value++;
            }

            return number == totalValue;
        }
    }

}
