package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here//
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        if((T>=1)||(T<=1000)) {
            for (int i = 0; i <= T; i++) {
                int A = scan.nextInt();
                int B = scan.nextInt();
                if((A>=1)||(A<=10000)&&(B>=1)||(B<=10000)){
                    System.out.println(A+B);
                    System.out.println("valid inputs");
                }else{
                    System.out.println("Try again");
                }
            }
        }else {
            System.out.println("Try again");
        }
    }
}
