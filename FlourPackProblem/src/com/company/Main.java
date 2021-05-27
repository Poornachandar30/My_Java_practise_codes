package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,3,8));
        System.out.println(canPack(3,1,13));
        System.out.println(canPack(5,0,3));
        System.out.println(canPack(3,0,5));
        System.out.println(canPack(0,4,2));
        System.out.println(canPack(0,8,10));
        System.out.println(canPack(0,0,10));
        System.out.println(canPack(1,1,6));
        System.out.println(canPack(3,6,6));
    }
    public static boolean canPack(int bigCount,int smallCount, int goal){
        int bigBag=0;
        int totalCount=0;
        int additionalBag=0;
        if(bigCount<0||smallCount<0||goal<0){
            return false;
        }else {
            while(bigCount>0){
                bigBag+=5;
                bigCount--;
        }
            additionalBag=goal-bigBag;
            if(additionalBag<0){
                return false;
            }
            if(additionalBag==0){
                return true;
            }else{
                while(smallCount>0){
                    goal--;
                    if(goal==0){
                        return true;
                    }
                }if(goal!=0){
                    return false;
                }
            }
        }
        return true;
    }
}
/*(No.of bigPacks x 5kg ) - goal
Gives u a result number if it is 0 true else no. Of smallpacks must be >= result number then true else false*/