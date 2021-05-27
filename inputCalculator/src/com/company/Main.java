package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        int sum=0;
        double average=0.0;
        int count=0;
       while(true){
           Scanner inputs = new Scanner(System.in);
           System.out.println("Enter your numbers");
           boolean isAnInt= inputs.hasNextInt();
           if(isAnInt){
               int number = inputs.nextInt();
               sum=sum+number;
               count++;
           }else{
               //System.out.println("Invalid");
               System.out.println("sum="+sum +"\n" +"avg="+Math.round(average));
               break;
           }
       }
       average=(sum/count);
        System.out.println("sum="+sum +"\n" +"avg="+Math.round(average));
    }
}
