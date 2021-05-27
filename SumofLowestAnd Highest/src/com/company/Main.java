package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int sum(int[] numbers)
    {
        int sum = 0;
        int highest=numbers[0];
        int lowest=numbers[0];
        if(numbers==null||numbers.length==1||numbers.length==0){
            return 0;
        }
        else {
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
                if (numbers[i] > highest) {
                    highest = numbers[i];
                }
                if (numbers[i] < lowest) {
                    lowest = numbers[i];
                }
            }
            sum -= highest + lowest;
            return sum;
        }

    }
}
