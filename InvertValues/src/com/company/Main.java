package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int[] invert(int[] array) {
        for(int i=0; i< array.length; i++){
            array[i]*=(-1);
         }

        return array;
    }
}
