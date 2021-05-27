package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean check(Object[] a, Object x) {
        // Your code here
        boolean result =false;
        for(int i=0; i<=a.length-1; i++){
            if(a[i]==x){
                result=true;
            }
        }
        return result;
    }
}
