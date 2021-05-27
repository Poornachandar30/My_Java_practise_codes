package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(DigitSum(3));
        System.out.println(DigitSum(123));
        System.out.println(DigitSum(-123));
    }

    public static int DigitSum(int number) {
        int sum=0;
        if(number<10){
            System.out.println("Invalid Input");
            return -1;

        }
        else{
            while (number!=0){
               sum=sum+number%10;
               number=number/10;

            }
            return sum;
            //return number;
        }

    }
}
