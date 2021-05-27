package com.company;

public class LaraCroft {
    private int health = 0;
    private  int power = 0;
    private  String weapons = "";
    private int ammo = 0;

    public LaraCroft(int laraHealth, int laraPower, String laraWeapons, int laraAmmo){
        this.health= laraHealth;
        this.power= laraPower;
        this.weapons= laraWeapons;
        this.ammo= laraAmmo;
    }
    public String jump(){
        return "Lara is jumping";
    }
    public String climb(){
        return "Lara is climbing";
    }
    public String mele(){
        return "Lara is attacking";
    }
    public String run(){
        return "Lara is running";
    }
    public String instinct(){
        return "Lara using her instinct";
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return this.health;
    }

    public void setPower(int power){
        this.power = power;
    }

    public int getPower(){
        return this.power;
    }

    public void setWeapons(String weapons){
        this.weapons = weapons;
    }

    public String getWeapons(){
        return this.weapons;
    }

    public void setAmmo(int ammo){
        this.ammo = ammo;
    }

    public int getAmmo(){
        return this.ammo;
    }
}
