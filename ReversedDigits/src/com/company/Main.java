package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        digitize(45762893920L );
    }
    public static int[] digitize(long n) {
        // Code here
        String hello = Long.toString(n);
        int[] result=new int[hello.length()];
        int i =0;
        while(n>=1){
            result[i] =  (int) (n%10);
            System.out.println(result[i]);
            n=n/10;
            i++;
        }
        return result;
    }
}
