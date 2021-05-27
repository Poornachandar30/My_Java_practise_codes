package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,1000));
        System.out.println(sumOdd(100,100));
    }

    public static boolean isOdd(int number) {
        if(number<=0) {
            return false;
        }
        while(number>0){
            if((number%2)!=0){
            return true;
        }else{
            return false;}
        }
          return true;
    }
    public static int sumOdd(int start,int end){
        int sum=0;
        if((start<0)||(end<0)){
            return -1;
        }else {
            for (int i = start; i <= end; i++) {
                if ((isOdd(i)) == true) {
                    sum = sum + i;
                }
            }
            return sum;
        }
    }
}
