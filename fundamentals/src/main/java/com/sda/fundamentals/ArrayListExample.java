package com.sda.fundamentals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
    private List<String> names = new ArrayList<>();

    public void listAdd(String str){
        names.add(str);
    }

    public void listRead(){
        System.out.println(names.toString());
    }

    public void listDelete(int index){
        names.remove(index);
    }

    public void listModify(int index, String element){
        names.set(index, element);
    }




}
