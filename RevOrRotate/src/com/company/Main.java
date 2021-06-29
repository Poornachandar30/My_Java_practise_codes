package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(revRot("733049910872815764",5));
    }
    public static String revRot(String strng, int sz) {
        System.out.println("strng " + strng);
        System.out.println("sz "+sz);
        if((sz==0)||(sz>strng.length())||(strng.equals(""))){
            return "";
        }
        else{
            int length = 0;
            String subs="";
            String revOrRotate ="";
            length = strng.length()-(strng.length() % sz);
            subs = strng.substring(0,length);
            int len = subs.length();
            int k=0;
            String part[]= new String[length/sz];
            for(int j=0; j<len; j+=sz){
                part[k] = subs.substring(j,Math.min(j,j+sz));
                k=k+1;
            }
            for(int i=0; i< part.length; i++){
                String split[]=part[i].split("");
                int[] chunks = new int[split.length];
                int digitCube = 0;
                for(int j=0; j< split.length; j++){
                    chunks[j] = Integer.parseInt(split[j]);
                    digitCube=(int)Math.pow(chunks[j],3)+digitCube;
                }
                if(digitCube%2==0){
                    StringBuilder sb =new StringBuilder(part[i]);
                    revOrRotate = revOrRotate+sb.reverse().toString();
                }else {
                    String shifting = part[i];
                    shifting = shifting.substring(1,sz) + Character.toString(part[i].charAt(0));
                    revOrRotate = revOrRotate + shifting;
                }
                System.out.println(Arrays.toString(part));
                System.out.println(Arrays.toString(chunks));
            }
            return revOrRotate;
        }
    }
}
