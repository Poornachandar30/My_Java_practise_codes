package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count=0;
        System.out.println("Enter the value of n:");
        Scanner input=new Scanner(System.in);
        int n =input.nextInt();
        for(int i=0;i<n;i++){
            if((i%3==0)||(i%5==0)){
                count+=i;
            }
        }
        System.out.println(count);
    }
}
