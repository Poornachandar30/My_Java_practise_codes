package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(28));
        System.out.println(isPerfect(5));
        System.out.println(isPerfect(-1));
    }
    public static int isPerfect(int num){
        int sum=0;
        if(num<0){
            return -1;
        }else{
            for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
            if(sum==num){
                System.out.println(true);
            }else {
                System.out.println(false);
            }

        }
        return sum;
    }
}
