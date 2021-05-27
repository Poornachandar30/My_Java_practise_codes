package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(monkeyCount(5));
    }
    public static int[] monkeyCount(final int n){
        int[] array = new int[n];
        int count =1;
        for(int i=0; i<n; i++){
            array[i] =count++;
            System.out.println(array[i]);
        }
        return array;
    }
}
