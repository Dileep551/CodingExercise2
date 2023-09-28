public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    public static int getGreatestCommonDivisor(int first, int second){

        int firstValue = 1;
        int secondValue = 1;

        if(first < 10 || second < 10){

            return -1;
        }

        else{
            while ((first > firstValue) && (second > secondValue) ) {

                if (first % firstValue == 0 && second % secondValue == 0) {

                    if(firstValue == secondValue){
                        System.out.println(firstValue+" "+secondValue);
                    }
                }
                firstValue++;
                secondValue++;
            }
        }
        return firstValue;
    }

}
