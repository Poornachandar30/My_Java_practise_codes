package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getAverage(new int[] {2,2,2,2}));
    }
    public static int getAverage(int[] marks){
        int average =0;
        for(int i=0; i<= marks.length-1; i++){
            average += marks[i];
            System.out.println(average);
        }
        average = average/marks.length;
        System.out.println(marks.length);
        return average;
    }

}
