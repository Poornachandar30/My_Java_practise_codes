package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(5));
        System.out.println(isPrimeNumber(9));
        System.out.println(isPrimeNumber(6));
        System.out.println(isPrimeNumber(7));
    }public static boolean isPrimeNumber(int number){
        boolean flag=true;
        if(number<0){
            return false;
        }else{
            for(int i=2;i<=number/2;i++){
             if(number%i==0){
                 flag=false;
             }   else {
                 flag=true;
             }
            }
            if(flag){
                System.out.println("It is a prime number");
            }else
                System.out.println("It not a prime number");
        }
        return flag;
    }
    /*public static int giveAllThePrimeNumbers(int n){
        boolean flag=true;
        if(n<1){
            return -1;
        }else{

        }

    }*/
}
