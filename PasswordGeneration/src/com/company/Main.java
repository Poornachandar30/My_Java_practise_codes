package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=0;i<10;i++) {
            PasswordGeneration(8);
        }
    }

    public static String PasswordGeneration(int n){
        char[] PasswordGeneration={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int count =0;
        Random rand = new Random();
        String GeneratedString="";
        for(int i=1;i<=n;i++){

                    count=rand.nextInt(25);
                    GeneratedString =GeneratedString+PasswordGeneration[count];
                    //System.out.println(count);

        }
        System.out.println(GeneratedString);

        return GeneratedString;
    }

}
