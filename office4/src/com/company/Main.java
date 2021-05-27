package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static Object meeting(char[] x) {
        int sum =0;
        System.out.print(Arrays.toString(x));
        int count =0;
        for(int i=0; i<x.length; i++){
            if(x[i]=='O'){
                if(count==0){
                    sum=i;
                    System.out.println(sum);
                }
                count++;
            }
        }
        // System.out.println(count);
        //System.out.println(sum);
        if(count>=1){
            return sum;
        }else{
            return "None available!";
        }
    }
}
