package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static String whoLikesIt(String... names) {
        //Do your magic here
        int result =0;
        if(names.length==0){
            return "no one likes this";
        }else if(names.length==1){
            return names[0]+" likes this";
        }else if (names.length==2){
            return names[0]+" and " + names[1]+ " like this";
        }else if(names.length==3){
            return names[0]+", "+ names[1]+" and "+ names[2]+" like this";
        }else {
            result = names.length-2;

            return names[0]+", "+names[1]+ " and "+result+" others like this";
        }

    }
}