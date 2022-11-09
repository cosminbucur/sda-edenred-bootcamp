package com.sda.patterns.behavioral.iterator.ex1;

import java.util.List;

public class ProfileIterator implements SocialNetworkIterator {

    private List<Profile> contacts;

    private int currentPosition = 0;

    public ProfileIterator(Linkedin linkedin) {
        this.contacts = linkedin.getContacts();
    }

    @Override
    public boolean hasNext() {
        return currentPosition < contacts.size();
    }

    @Override
    public Profile next() {
        if (!hasNext()) {
            return null;
        } else {
            Profile profile = contacts.get(currentPosition);
            currentPosition++;
            return profile;
        }
    }

}
