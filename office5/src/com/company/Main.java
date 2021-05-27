package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code her
    }
    public static Object meeting(Room[] x, int need) {
        int[] result = new int[x.length];
        int count=0;
        StringBuilder input = new StringBuilder(x);
        if(need==0){
            return "Game On";
        }else {

            System.out.println(x.length);

            for (int i = 0; i < x.length; i++) {
                int occupied = x[i].occupants.length();
                System.out.println(x[i].occupants);
                System.out.println(x[i].chairs);
                int balanceSeat = x[i].chairs - occupied;

                if (balanceSeat <= 0) {
                    result[i] = 0;
                } else {
                    result[i] = balanceSeat;
                    for(int j=Arrays.stream(result).sum(); j>need; j--) {
                        if (Arrays.stream(result).sum() > need) {
                            result[i] = balanceSeat--;
                        }
                    }
                    if(Arrays.stream(result).sum() == need) {
                        System.out.println(Arrays.stream(result).sum());
                        result=Arrays.copyOf(result, i+1);
                    }
                }
            }
          //  System.out.println(Arrays.toString(result));
          //      System.out.println(need);
            if(Arrays.stream(result).sum()<need){
                return "Not enough!";
            } else
            return result;
        }
    }
}
