public class PaintJob {
    // write your code here

    public static int getBucketCount(double width, double height,double areaPerBucket, int extraBuckets){

        if(width <=0 || height <=0 || areaPerBucket<=0 || extraBuckets <0){
            return -1;
        }else{
            double wallArea = Math.ceil(width * height);
//            System.out.println(wallArea);
//            System.out.println(wallArea / 0.5);
           //System.out.println((int) (Math.ceil(wallArea) / areaPerBucket) - extraBuckets);
            //return (int)(Math.ceil(wallArea) / areaPerBucket) - extraBuckets;
           // System.out.println((int) (Math.ceil(wallArea) / areaPerBucket) - extraBuckets);

            System.out.println((int)Math.ceil((wallArea-(areaPerBucket * extraBuckets)))/areaPerBucket);

            return (int) Math.ceil(((wallArea-(areaPerBucket * extraBuckets)))/areaPerBucket);

        }

    }


    public static int getBucketCount(double width, double height,double areaPerBucket){

        if(width <=0 || height <=0 || areaPerBucket<=0){
            return -1;
        }else{

            double wallArea = Math.round(width * height);
            //System.out.println((int) Math.ceil((wallArea % areaPerBucket)));
            return (int) Math.ceil((wallArea % areaPerBucket));

        }

    }


    public static int getBucketCount(double area, double arePerBuckets){

        if(area <=0 || arePerBuckets <=0){
            return -1;
        }else{

            int buckets = (int) Math.ceil(area / arePerBuckets);
            return (int) Math.ceil(buckets );

        }

    }

public static void main(String[] args){
    //getBucketCount(3.4,2.1,1.5,2);
     //  getBucketCount(0.75,0.75,0.5,0);
//        getBucketCount(-3.4,2.1,1.5,2);
       getBucketCount(2.75,3.25,2.5,1);
//
//        getBucketCount(3.4,1.5);
//        getBucketCount(6.26,2.2);
//        getBucketCount(3.26,0.75);
      }
}