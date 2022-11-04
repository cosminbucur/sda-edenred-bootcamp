package com.sda.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("testString");
        String str = (String) list.get(0);
        List list2 = new ArrayList();
        list2.add(1);
        list2.add(2);
        list2.add("ceva");

    }
}
