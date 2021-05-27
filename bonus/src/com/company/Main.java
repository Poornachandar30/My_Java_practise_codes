package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static String bonusTime(final int salary, final boolean bonus) {
        // show me the code!
        if(bonus){
            return "\u00A3"+(salary*10);
        }
        else {
            return "\u00A3"+(salary);
        }
    }
}
