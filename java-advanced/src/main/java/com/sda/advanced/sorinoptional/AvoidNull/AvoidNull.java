package com.sda.advanced.sorinoptional.AvoidNull;

import java.util.ArrayList;
import java.util.List;

public class AvoidNull {

    private static String badString = null;
    private static String goodString = "";

    private static List<String> badList;

    private static List<String> goodList = new ArrayList<>();

    public static void main(String[] args){
        goodString.toUpperCase();

        printBadList(badList);

        for(String item : goodList){
            System.out.println(item);
        }
    }

    private static void printBadList(List<String> badList) {
        for(String item : badList){
            System.out.println(item);
        }
    }
}
