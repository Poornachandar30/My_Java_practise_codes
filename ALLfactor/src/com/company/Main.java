package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        printFactors(60);
    }
    public static int printFactors(int number){
        if(number<1){
            System.out.println("Invalid Number");
            return -1;
        }for(int i=1;i<=number;i++) {

            if((number % i)==0) {
                System.out.println(i);

            }
        }

        return 1;
    }
}
