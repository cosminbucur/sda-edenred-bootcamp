package com.sda.advanced.collections.set.slide1;

import java.util.HashSet;
import java.util.Set;

import com.sda.advanced.collections.CollectionPrinter;

public class DemoSlide1 {

    public static void main(String[] args) {
        Set<String> travelRoute = new HashSet<>();
        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("Madrid");
        travelRoute.add("Paris");
        travelRoute.add("Berlin");
        travelRoute.remove("Paris");

        // prints Berlin Madrid, order may differ
        // as set is not ordered
        CollectionPrinter.printSet(travelRoute);
    }

}
