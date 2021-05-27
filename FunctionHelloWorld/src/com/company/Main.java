package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static String greet() {
        return "hello world!";

    }
    public static int century(int number) {
        // your code goes here
        int mod = number%100;
        int divide = number/100;
        int century = 0;
        if(number < 100){
            century = 1;
        }if(mod==0){
            century = divide;
        } else{
            century = divide+1;
        }
        return century;

        return number < 100 ? century=1 : mod==0 ? century = divide : mod!=0 ? century = divide+1 ;
    }
}
