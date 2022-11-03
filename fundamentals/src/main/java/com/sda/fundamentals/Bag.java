package com.sda.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class Bag <T>{
    private List<T> array = new ArrayList<T>();

    Bag(){

    }

    Bag (T obj){
        array.add(obj);
    }

    public void add(T value){
        array.add(value);
    }


}
