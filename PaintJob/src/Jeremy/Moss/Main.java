package Jeremy.Moss;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double wallArea = width * height;
        double areaToCover = wallArea - (areaPerBucket * extraBuckets);
        if (areaToCover % areaPerBucket != 0){
            int bucketsToBuy = (int) (areaToCover / areaPerBucket) + 1;
            return bucketsToBuy;
        }
        return (int) (areaToCover/areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return - 1;
        }
        double wallArea = width * height;
        if (wallArea % areaPerBucket != 0){
            int bucketsToBuy = (int) (wallArea/areaPerBucket) + 1;
            return bucketsToBuy;
        }
        return (int) (wallArea / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        if (area % areaPerBucket != 0){
            int bucketsToBuy = (int) (area / areaPerBucket) + 1;
            return bucketsToBuy;
        }
        return (int) (area / areaPerBucket);
    }
}
