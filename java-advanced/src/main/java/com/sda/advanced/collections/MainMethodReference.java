package com.sda.advanced.collections;

public class MainMethodReference {

    public static void main(String[] args) {
        Elise elise = new Elise();


        Jungler jungler = elise::stun;
        jungler.gank();
        // INTERFATA = IMPLEMENTARE



    }

}
