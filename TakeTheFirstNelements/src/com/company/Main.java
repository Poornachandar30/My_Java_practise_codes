package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    }
    public static int[] take(int[] arr, int n) {
        int[] sliced = Arrays.copyOfRange(arr,0,n);
        for(int i=0; i< sliced.length; i++) {
            System.out.println(sliced[i]);
        }
        if(arr.length==0||n==0){
            return sliced=new int[0];
        }else
            return sliced;

    }

}
