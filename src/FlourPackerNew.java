public class FlourPackerNew {

    public static boolean canPack(int bigCount, int smallCount, int goal){

        int bigCountBags = 5 * bigCount;

        if(bigCount < 0 || smallCount < 0 || goal < 0){

            return false;
        }
        else{

            if(bigCountBags == goal && smallCount == 0 ){
                return true;
            }
            if(bigCountBags == 0 && goal <= smallCount){
                return true;
            }
            if(bigCountBags > goal && smallCount == 0 ){
                return false;
            }if(goal - bigCountBags == smallCount){

                return true;
            }
            if(bigCountBags % goal == 0 && goal >= bigCountBags){
                return true;
            }

        }

        return false;
    }


}
