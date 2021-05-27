package com.company;

public class Main {

    public static void main(String[] args) {
     //printSquareStar(16);
    // printX(5,8);
     printX(10, 5);

    }
    public static int printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid");
        }else
            {
            for(int i=1;i<=number;i++)
            {
            for(int j=1;j<=number;j++){
                if((i==1)||(i==number)||(j==1)||(j==number)||(i==j)||(i+j==number+1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        }
        return 1;
    }

    public static int printX(int row,int column) {
        int n=1;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=column;j++){
                if((j==n)||(n+j==column+1)||(i==1)||(i==row)||(j==1)||(j==column)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            n++;
            if(n>=column){
                n=1;
            }
        }
        return 1;
    }


}
