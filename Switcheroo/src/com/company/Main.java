package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(switcheroo("abcab"));
    }
    public static String switcheroo(String x){
        String[] input = x.split("");
        String result ="";
        for(int i=0; i<input.length; i++){
            if(input[i]=="a"){
                input[i] ="b";
            }else if(input[i]=="b"){
                input[i] = "a";
            }else {
                input[i]="c";
            }
        }

        return Arrays.toString(input).toString();
    }
}
