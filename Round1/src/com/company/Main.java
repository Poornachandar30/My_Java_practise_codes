package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String  inputString = input.nextLine();
        System.out.println("split-count: ");
        int number = input.nextInt();
        String[] split = inputString.split(" ");
        System.out.println(Arrays.toString(split));
        if(split.length<=number){
            System.out.println("split count not exceeding the limit: "+split.length);
        }else
            System.out.println("split count exceeding the limit: "+split.length);

    }
}
