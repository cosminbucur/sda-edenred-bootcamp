package com.sda.patterns.behavioral.iterator.ex1;

public class Profile {

    private String name;
    private String email;

    public Profile(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
