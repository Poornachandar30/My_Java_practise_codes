package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(25));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(21));
    }
    public static int getLargestPrime(int number){
        int m=0;
        int i=0;
        m=number/2;
        if(number<1){
            return -1;
        }else{
            for(i=m;i<=m;i--){
                if(number%i==0){
                    for(int j=2;i<=i;j++){
                        if(i%j!=0){
                            return i;
                        }
                    }
                }
            }
            }
        return i;
        }
}
