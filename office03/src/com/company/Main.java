package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        broken("01111111010010000001100110111");
    }
    public static String broken(final String x) {
        // Your code here
        String[] array = x.split("");
        for(int i=0; i<= array.length-1; i++)
        {
            if(array[i].equals("1")){
                array[i]="0";
            }else{
                array[i]="1";
            }
        }
        String result = String.join("",array);
        System.out.println(Arrays.toString(array));
        System.out.println(result);
        return result;
       // return x.replace("0"," ").replace("1","0").replace(" ","1");
   }

}
