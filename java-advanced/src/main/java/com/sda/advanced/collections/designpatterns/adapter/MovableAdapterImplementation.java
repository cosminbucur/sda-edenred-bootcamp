package com.sda.advanced.collections.designpatterns.adapter;

public class MovableAdapterImplementation implements MovableAdapter{

    private Movable movable;

    MovableAdapterImplementation(Movable movable){
        this.movable = movable;
    }

    public double getSpeed(){
        return 3.5 * this.getSpeed();
    }
}
