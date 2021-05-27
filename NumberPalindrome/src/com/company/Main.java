package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(4321));
    }

    public static boolean isPalindrome(int number) {
        int reverse=0;
        int referenceVariable=number;
        while(number!=0){
         int digit=number%10;
         reverse=reverse*10+digit;
         number/=10;
        }if(reverse==referenceVariable) {
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
            return false;
        }
            return true;
    }
}
