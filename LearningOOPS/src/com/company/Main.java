package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
     /*   Dog dog1 = new Dog();
        Dog dog2 = new Dog("pinku","pommeriyan");
        System.out.println(dog1.name);
        System.out.println(dog1.eat());

        String dog2name = dog2.name;
        System.out.println(dog2name);

        Dog dog3 = new Dog();
        Dog dog4 = new Dog("lucy","pommeriyan");
        System.out.println(dog3.name);
        System.out.println(dog4.name + " is " + dog4.breed);
       // System.out.println(dog4.is.breed);  */

        //datatype []variableName = new datatype[arraySize];

        int []arrayOne = new int[10];
        double []arrayTwo = new double[10];
        char []arrayThree = new char[10];
        String []arrayFour = new String[10];

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(arrayThree));
        System.out.println(Arrays.toString(arrayFour));

//        System.out.println(arrayOne.length);
//
//        for (int i = 0; i < arrayOne.length; i++) {
//            System.out.print(arrayOne[i]+" ");
//        }
//        System.out.println();
//
//        for(int i = 0; i < arrayTwo.length; i++) {
//            System.out.print(arrayTwo[i]+" ");
//        }
//        System.out.println();
//
//        for(int i = 0; i < arrayThree.length; i++) {
//            System.out.print(arrayThree[i]+" ");
//        }
//        System.out.println();


        LaraCroft player1 = new LaraCroft(100,100,"gun",80);
        LaraCroft player2 = new LaraCroft(80,90,"sword",90);

        System.out.println("Health: "+ player1.getHealth());
        player1.setHealth(30);

        System.out.println(player1.getHealth());
        System.out.println(player2.getHealth());
        System.out.println("Power: " + player1.getPower());
        player1.setPower(60);
        System.out.println("Power: " + player1.getPower());
        System.out.println("Weapon: "+player1.getWeapons());
        player1.setWeapons("vandal");
        System.out.println("Weapon: "+player1.getWeapons());
        System.out.println("ammo: "+player1.getAmmo());
        player1.setAmmo(100);
        System.out.println("ammo: "+player1.getAmmo());
        System.out.println(player1.climb());
        System.out.println(player1.instinct());
        System.out.println(player1.mele());


    }

}
