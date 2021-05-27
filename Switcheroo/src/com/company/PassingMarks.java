package com.company;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class PassingMarks
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int i = 0; i < testCases; i++){
            int []scores = new int[7];

            for (int j = 0; j < 7; j++){
                scores[j] = scan.nextInt();
            }

            int Amin = scores[0];
            int Bmin = scores[1];
            int Cmin = scores[2];
            int Tmin = scores[3];
            int A = scores[4];
            int B = scores[5];
            int C = scores[6];

            if((A>=Amin)&&(B>=Bmin)&&(C>=Cmin)&&(A+B+C) >= Tmin){
                    System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }

    }
}

