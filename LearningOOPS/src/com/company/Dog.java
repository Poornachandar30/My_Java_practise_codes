package com.company;

public class Dog {
    public String breed = "shitzu";
    public String name = "unknown";
    public int noOfLegs = 4;

    public Dog(){

    }

    public Dog(String dogName, String breedName){
        this.name = dogName;
        this.breed = breedName;
    }


    public String eat(){
        return (this.name + " is eating");
    }

    public String play(){
        return "Dog is playing";
    }
}
