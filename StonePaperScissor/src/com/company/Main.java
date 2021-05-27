package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int countP1 = 0;
        int countP2 = 0;

        for(int i = 0; i<3; i++){
            System.out.println("Enter your String for player1: ");
            Scanner input = new Scanner(System.in);
            String p1 = input.next();
            System.out.println("Enter your String for player2: ");
            String p2 = input.next();
            int output = rps(p1,p2);
            if(output==1  ){
                countP1+=1;
            }else if(output==2){
                countP2+=1;
            }
        }
        String result = checkWhoWon(countP1,countP2);
        System.out.println(result);

    }
    public static String checkWhoWon(int countP1, int countP2){

        if((countP1>countP2)){
            return "Player1 won the game!";
        }else if((countP2>countP1)){
            return "Player2 won the game!";
        }else{
            return "Draw!";
        }
        
    }
    public static int rps(String p1, String p2) {
        // your code
        String rock = "rock";
        String paper = "paper";
        String scissor = "scissors";
        if(p1==p2){
            return 0;
        }
        else if(((p1==rock)&&(p2==scissor))||((p1==scissor)&&(p2==paper))||((p1==paper)&&(p2==rock))){
            return 1;
        }
        else{
            return 2;
        }
    }
}
