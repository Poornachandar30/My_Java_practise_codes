package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(revRot("733049910872815764",5));
    }
    public static String revRot(String strng, int sz) {
        if((sz==0)||(sz>strng.length())||(strng=="")){
            return "";
        }
        else{
             int length = 0;
             String substring="";
             length = strng.length()-(strng.length() % sz);
            substring = strng.substring(0,length);
            int len = substring.length();
            int k=0;
            String part[]= new String[sz];
            for(int j=0; j<len; j+=sz){
                part[k] = substring.substring(j,j+sz);
                k=k+1;
            }
            for(int i=0; i<= part.length; i++){
                if(part[i]==null){
                    break;
                }
                String split[]=part[i].split("");
                int[] chunks = new int[split.length];
                int digitCube = 0;
                 String revOrRotate ="";
                for(int j=0; j< split.length; j++){
                    chunks[j] = Integer.parseInt(split[j]);
                    digitCube=chunks[j]^3+digitCube;
                }
                if(digitCube%2==0){

                }
                System.out.println(Arrays.toString(chunks));
            }
            System.out.println(Arrays.toString(part));
            return "";
        }
    }
}
