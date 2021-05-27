package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static  int getEvenDigitSum(int number){
        int sum=0;
        int place=0;
        if(number<=0){
            return -1;
        }else {
            while(number>0){
                place=number%10;
               // System.out.println(place);
                if((place%2)==0){
                    sum=sum+place;
                    //System.out.println(sum);
                }
                number=number/10;
               //System.out.println(number);
            }
        }
        return sum;
    }
}
