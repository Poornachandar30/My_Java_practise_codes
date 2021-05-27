package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(solution1("noob"));
        System.out.println(liters(2));

    }
    public static String remove(String str) {

        String result="";
        str = str.substring(1,str.length()-1);
        return(result);
    }
    public static String solution(String str) {
        // Your code here...
        String result = "";
        StringBuilder newStr = new StringBuilder(str);
        result =newStr.reverse().toString();

        return result;
    }
    public static String solution1(String str) {
        // Your code here...
        String newStr = "";
        for(int i=str.length()-1;i>=0;--i){

            newStr += str.charAt(i);

        }

        return newStr;
    }
    static String noSpace(final String x) {
        String y=x.replaceAll("\\s","");
        return y;
    }
    public static int summation(int n) {
        int finalOutput = 0;
        for(int i=0;i<=n;i++){
            finalOutput += i;
        }
        return finalOutput;
    }
    public static String boolToWord(boolean b)
    {
        return b ? "yes" : "No";
    }
    public static String numberToString(int num) {
        // Return a string of the number here!
        return Integer.toString(num);

    }
    public static int stringToNumber(String str) {
        //TODO: Convert str into a number
        return Integer.parseInt(str);
    }
    public static int Past(int h, int m, int s)
    {
        //Happy Coding! ^_^
        return h*3600000 + m*60000 + s*1000;
    }
    public static int points(String[] games) {
        //implement me
        int points = 0;
        int x = 0;
        int y = 0;
        for (String checkInt: games)
        {
            x = (int) checkInt.charAt(0);
            y = (int) checkInt.charAt(2);
            if(x>y){
                points+=3;
            }
            if (x==y) {
            points += 1;
        }
            if(x<y){
                points+=0;
            }

        }
            return points;
    }
    public static int sum(int[] arr){
        int sum = 0;
        for (int checkSum: arr)
        {
            int x = checkSum;
            sum+= x>0 ? x : 0;
        }

        return sum;
    }
    public static int findSmallestInt(int[] args) {
        int result = args[0];
        for (int i=0; i<=args.length; i++)
        {
            if(result>args[i]){
                result = args[i];
            }
        }
        return result;
    }
    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int result = 0;
        for (Boolean i: arrayOfSheeps)
        {
            if(i!=null){
                result+= i ? 1 :0;
            }
        }
        return result;
    }
    public static int liters(double time)  {
        return (int) (time/2);
    }
  /*  public static int[] digitize(long n) {
        // Code here
        String array = 
        for (long i=0; i<=n;i++)
        {

        }
        return intArray;
    }*/
  public Object[] arguments;

    public int[] Swapper(final Object[] args){
        arguments [2]= args[2];
        return arguments[2];
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = args[0];
        args[0] = args[1];
        args[1] = temp;
    }

}

