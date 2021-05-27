package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        }
    public static String findNeedle(Object[] haystack) {
        String result ="";
        for (int i=0;i< haystack.length;i++)
        {
            if(haystack[i]=="needle"){
              result="found the needle at position "+i;
            }
        }
        return result;
    }
}
