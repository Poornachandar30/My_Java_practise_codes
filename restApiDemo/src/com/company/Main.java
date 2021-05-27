package com.company;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static String func(){
        return "Hello";
    }
    public static void main(String[] args) throws InterruptedException {
	// write your code here
        String hello=func();
        try {
            URL class2 = new URL("https://www.imdb.com/list/ls052283250/");
            URLConnection class2Connection=class2.openConnection();

            int statusCode = class2Connection.getResponseCode();
            if (statusCode == 200) {
                System.out.println(statusCode);
            }else {
                System.out.println("error");
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(String.valueOf(1234).concat("5678").toLowerCase());
    }
}
