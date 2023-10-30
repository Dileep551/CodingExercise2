public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        double area = 0;

        double totalBuckets = 0;

        double bucketToBuy = 0;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        else{

            area = width * height;

            totalBuckets = area / areaPerBucket;

            bucketToBuy = Math.ceil((double) totalBuckets - extraBuckets);

            return (int)bucketToBuy;


        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){

        double area = 0;

        double bucketToBuy = 0;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        else {

            area = width * height;

            bucketToBuy = Math.ceil(area / areaPerBucket);

            return (int)bucketToBuy;

        }

    }
    public static int getBucketCount(double area, double areaPerBucket){

        double bucketToBuy = 0;

        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        else{

            bucketToBuy = Math.ceil((double) area / areaPerBucket);

            return (int)bucketToBuy;

        }
    }
}
