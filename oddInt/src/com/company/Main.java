package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int findIt(int[] a) {
        int count =0;
        int odd = 0;
        for(int i =0; i<=a.length-1; i++){
            for(int j=0; j<= a.length-1; j++){
                if(a[i]==a[j]){
                    count+=1;
                }
            }if(count%2!=0){
                odd = a[i];
                return a[i];
            }else{
                continue;
            }
        }
        return odd;
    }
}
