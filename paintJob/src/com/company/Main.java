package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(3.4,1.5));
    }
    public static long getBucketCount(double width,double height,double areaBucket,int extraBucket){
        double area=0;
        long bucket=0;
        if(height<=0||width<=0||areaBucket<=0||extraBucket<0){
            return -1;
        }else{
            area=width*height;
            bucket=getBucketCount(width,height,areaBucket);
            bucket=bucket-extraBucket;
        }
        return bucket;
    }
    public static long getBucketCount(double width,double height,double areaPerBucket){
        double area=0;
        long bucket=0;
     if(width<=0||height<=0||areaPerBucket<=0){
         return -1;
     }else{
         area=width*height;
         bucket=Math.round(area/areaPerBucket);
     }
     return bucket;
    }
    public static long getBucketCount(double area,double areaPerBucket){
        long bucket=0;
        if(area<=0||areaPerBucket<=0){
            return -1;
        }else{
            bucket=Math.round(area/areaPerBucket);
            bucket= (long) Math.ceil(bucket);
        }
        return bucket;
    }
}
