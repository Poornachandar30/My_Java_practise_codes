package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code her
        System.out.println(abbrevName("Sam Harris"));
    }
    public static String abbrevName(String name) {
        String[] split = name.split(" ");
        return (split[0].charAt(0) + "." + split[1].charAt(0)).toUpperCase();
    }
}
