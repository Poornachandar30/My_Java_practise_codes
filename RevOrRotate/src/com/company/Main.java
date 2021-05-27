package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(revRot("733049910872815764",5));
    }
    public static String revRot(String strng, int sz) {
        System.out.println("String: "+strng);
        System.out.println("length :"+strng.length());
        System.out.println(sz);
        if((sz==0)||(sz>strng.length())||(strng=="")){
            return "";
        }
        else{
             int length = strng.length();
             int actualLength = 0;
             String substring="";
             actualLength = length % sz;
            System.out.println(actualLength);
             int count = 0;

             int i = actualLength;
             while( i>0) {
                 actualLength = actualLength-1;
                 i=actualLength;
                 count++;
             }
             count = strng.length()-count;
            System.out.println(count);
            if (actualLength == 0){
                substring = strng.substring(0,count);
                System.out.println(substring);
            }
            int len = substring.length();
            int count2 = 0;
            for(int j=0; j<len; j+=sz){
                String part = substring.substring(j,Math.min(len,j+sz));
                count2+=1;
            }
            String[count2] split = new int[count2];
            for(int k=0;k<=count2;k++){

            }
            return "";
        }
    }
}
