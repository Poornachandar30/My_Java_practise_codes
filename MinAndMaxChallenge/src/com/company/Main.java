package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            int min=0;
            int max=0;
            boolean first = true;
        while (true){
            Scanner inputs = new Scanner(System.in);
            System.out.println("Enter your numbers");
            boolean isAnInt = inputs.hasNextInt();
            if(isAnInt){
                int Number= inputs.nextInt();
                if(first){
                    first=false;
                    max=Number;
                    min=Number;
                }
                if(Number>max){
                    max=Number;
                }if(Number<min){
                    min=Number;
                }
            }else{
                System.out.println("The Max value is: "+max);
                System.out.println("The Min value is: "+min);
                break;
            }

        }
    }
}
