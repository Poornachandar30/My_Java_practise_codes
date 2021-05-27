package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean hasSameLastDigitChecker(int a,int b,int c){
        if((a<10)||(a>1000)||(b<10)||(b>1000)||(c<10)||(c>1000)){
            return false;
        }else
            {
                int x=a%10;
                while(a<10){
                a=a/10;
            }
                int y=b%10;
                while(b<10){
                    b=b/10;
                }
                int z=c%10;
                while(c<10){
                    c=c/10;
                }

            if((a==b)||(a==y)||(a==c))

        }

    }
}
