package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Divide\n5.q");
        System.out.print("Enter your choice: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = 0;
        input.close();
        if(choice==5){
            System.exit(0);
        }

        else if(choice==1){
            System.out.println(a+b);
        }
        else if(choice==2){
            System.out.println(a-b);
        }
        else if(choice==3){
            System.out.println(a*b);
        }
        else if(choice==4){
            System.out.println(a/b);
        }
    }

}
