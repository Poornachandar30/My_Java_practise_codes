package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static String boredom(Person[] staff) {
        String ch ="";
        int sum =0;
        for(int i=0; i<staff.length; i++ ) {
            ch = staff[i].department;
            System.out.println(ch);
            switch (ch){
                case "accounts" :
                    sum+=1;
                    break;
                case "finance" :
                    sum+=2;
                    break;
                case "canteen" :
                    sum+=10;
                    break;
                case "regulation" :
                    sum+=3;
                    break;
                case "trading" :
                    sum+=6;
                    break;
                case "change" :
                    sum+=6;
                    break;
                case "IS" :
                    sum+=8;
                    break;
                case "retail" :
                    sum+=5;
                    break;
                case "cleaning" :
                    sum+=4;
                    break;
                case "pissing about" :
                    sum+=25;
                    break;
                default:
                    sum =sum;

            }
        }
        System.out.print(sum);
        if(sum<=80){
            return "kill me now";
        }else if ((sum<100) && (sum>80)){
            return "i can handle this";
        }else {
            return "party time!!";
        }

    }
}
