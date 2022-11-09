package com.sda.patterns.behavioral.iterator.ex1;

import java.util.List;

public class Linkedin implements SocialNetwork {

	private List<Profile> contacts;

	public Linkedin(List<Profile> contacts) {
		this.contacts = contacts;
	}

	@Override
	public SocialNetworkIterator iterator() {
		return new ProfileIterator(this);
	}

	public List<Profile> getContacts() {
		return contacts;
	}
}
