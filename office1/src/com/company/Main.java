package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static String outed(Person[] meet, String boss) {

        String result="";
        double avg = meet.length;
        System.out.println(avg);
        int sum =0;

        for(int i=0; i<meet.length; i++){
            if(boss.equals(meet[i].name)) {
                sum += meet[i].happiness * 2;
            }else{
                sum += meet[i].happiness;
            }
            }
        avg = sum/avg;
        if(avg>5){
            result = "Nice Work Champ!";
        }else {

            result ="Get Out Now!";
        }
        return result;
    }
}
