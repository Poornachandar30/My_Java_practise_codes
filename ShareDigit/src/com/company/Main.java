package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(12,23));
    }
    public static boolean hasSharedDigit(int num1,int num2){
        int a=0;
        int b=0;
        if((num1<10) ||(num2>99)){
            return false;
        }
        else{
            a=num1%10;
            num1=num1/10;
            b=num2%10;
            num2=num2/10;
        }
       if(a==b||a==num2||num1==b||num1==num2){
           return true;
       }

return true;


    }
}
