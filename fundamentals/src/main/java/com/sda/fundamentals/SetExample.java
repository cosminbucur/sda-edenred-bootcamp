package com.sda.fundamentals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    private Set<String> set = new HashSet<>(){};
    private Iterator<String> it = set.iterator();
    public void addSet(String str){
        set.add(str);
    }

    public void iterate(){
        while(it.hasNext()){
            it.next();
        }
    }




}
