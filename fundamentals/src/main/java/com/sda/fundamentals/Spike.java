package com.sda.fundamentals;

public class Spike {

    private static int staticInt = 1;

    static {
        System.out.println("1st static int");
    }
    static {
        System.out.println("2st static int");
    }
    private  String name ="Alex";
    {
        System.out.println("1st instance init");
    }
    {
        System.out.println("2nd instance init");
    }
    Spike(){
        System.out.println("No argument constructor");
    }
    Spike(int x){
        System.out.println("ONE argument constructor");
    }

}
