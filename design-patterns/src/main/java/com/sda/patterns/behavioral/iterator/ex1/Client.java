package com.sda.patterns.behavioral.iterator.ex1;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        SocialNetwork network = new Linkedin(createProfiles());
        SocialNetworkIterator iterator = network.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public static List<Profile> createProfiles() {
        return List.of(
                new Profile("cristi@gmail.com", "Cristi"),
                new Profile("elena@gmail.com", "Elena"),
                new Profile("paul@gmail.com", "Paul")
        );
    }
}
