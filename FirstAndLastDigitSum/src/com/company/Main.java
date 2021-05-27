package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumFirstAndLastDigit(5264));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(10));
    }
    public static int sumFirstAndLastDigit(int number){
        int firstDigit=0;
        int lastDigit=0;
        if(number<=0){
            System.out.println("Invalid value");
            return -1;
        }
        else
            {
            lastDigit=number%10;
           while((number>=10)){
                number=number/10;
                firstDigit=number;
            }

        }
        return firstDigit+lastDigit;
    }
}
