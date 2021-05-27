package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(100);
        numberToWords(253);
    }
    public static int numberToWords(int number){
        int a=0;
        int original_count=0;
        int reverse_count=0;
        int countDiff=0;
        if(number<0){
            return -1;
        }else{original_count=getDigitCount(number);
            number=reverse(number);
            reverse_count=getDigitCount(number);
            countDiff=original_count-reverse_count;
            while (number>0){
                a=number%10;
                number=number/10;
                if(a==0)
                    System.out.println("zero");
                if(a==1)
                    System.out.println("one");
                if(a==2)
                    System.out.println("two");
                if(a==3)
                    System.out.println("three");
                if(a==4)
                    System.out.println("four");
                if(a==5)
                    System.out.println("five");
                if(a==6)
                    System.out.println("six");
                if(a==7)
                    System.out.println("seven");
                if(a==8)
                    System.out.println("eight");
                if(a==9)
                    System.out.println("nine");
            }
            while(countDiff>0){
                System.out.println("zero");
                countDiff--;
            }
        }
        return 1;
    }
    public static int reverse(int rev){
        int b=0;
        while(rev>0){
              b=b*10+rev%10;
              rev=rev/10;
            }
        return b;
    }
    public static int getDigitCount(int num){
        int count=0;
         while(num>0)
            {
            num=num/10;
            count++;
        }
        return count;
    }

}
