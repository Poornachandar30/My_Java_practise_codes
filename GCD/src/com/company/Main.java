package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(30,12));
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }
    public static int getGreatestCommonDivisor(int first,int second){
        int c=0;
        if(first<10||second<10){
            return -1;
        }else {
            for(int i=1;i<=first;i++){
                //for(i=1;i<=second;i++){
                    if((first%i==0)&&(second%i==0)){
                        c=i;
                    }
                }
            }
        return c;
    }
}
