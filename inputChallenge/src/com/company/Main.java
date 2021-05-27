package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int result=0;
        int counter=1;

	while(true){
        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter number#"+counter);
        boolean isAnInt = inputs.hasNextInt();

        if(isAnInt){
            int numbers = inputs.nextInt();
            result=result+numbers;
            counter++;
            if(counter==11){
                break;
            }else{
                continue;
            }
        }else{
            System.out.println("Invalid value");
            continue;
        }
    }
        System.out.println(result);
    }
}
