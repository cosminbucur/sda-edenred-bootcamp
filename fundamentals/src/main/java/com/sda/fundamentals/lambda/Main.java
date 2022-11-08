package com.sda.fundamentals.lambda;

public class Main {
    public static void main(String[] args) {
        Cleanable cleanable = new CleanableImpl();
        cleanable.clean();

        Cleanable cleanable1 = new Cleanable() {
            @Override
            public void clean() {
                System.out.println("clean");
            }
        };

        cleanable1.clean();

        Cleanable cleanable2 = () -> System.out.println("cleaning");

        cleanable2.clean();


        // two string imputs -> concatenate and uppercase

        String str1 = "abra";
        String str2 = "cadabra";

        TwoParams str3 = (String s1, String s2) -> {
            return s1.concat(s2).toUpperCase();
        };
    }
}
