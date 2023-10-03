public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){

        if(first < 10 || second < 10){

            return -1;
        }
        else{
            int value;
            if( first < second){
                value = first;
            }
            else
                value = second;

            for(value = value; value > 1; value--){

                if(first % value== 0 && second % value == 0)
                    return value;
            }
            return 1;
        }

    }

}
