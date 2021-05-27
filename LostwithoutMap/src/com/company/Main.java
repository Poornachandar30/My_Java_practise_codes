package com.company;

public class Main {

    public static void main(String[] args) {
        map(new int[]{1, 2, 3});
    }
    public static int[] map(int[] arr) {
      for(int i=0; i<arr.length; i++){
          arr[i] = arr[i]*2;
          System.out.println(arr[i]);
      }
      return arr;
    }
}
