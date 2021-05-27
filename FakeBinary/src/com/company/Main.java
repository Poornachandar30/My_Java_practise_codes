package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        fakeBin("366058562030849490134388085");
    }
    public static String fakeBin(String numberString) {
        char[] reverse = numberString.toCharArray();
        String output = "";
        for(int i=0; i<= reverse.length-1; i++) {
            if (reverse[i] < '5') {
                reverse[i] = '0';
            }
            else  {
                reverse[i] = '1';
            }
        }
        System.out.println(new String(reverse));
       return new String(reverse);
    }
}
