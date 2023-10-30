public class FlourPacker {



    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int bigCountBagKgs = bigCount * 5;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        else {

            int maxBigBags = goal / 5;

            int effectiveBigBagCount = Math.min(bigCount, maxBigBags);
            return goal - (5 * effectiveBigBagCount)  <= smallCount;


        }
    }

}
