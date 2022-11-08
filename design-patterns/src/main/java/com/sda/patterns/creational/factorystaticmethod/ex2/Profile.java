package com.sda.patterns.creational.factorystaticmethod.ex2;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Profile {

	private static final Logger LOGGER = Logger.getLogger(Profile.class.getName());
	private final String email;
	private final String password;
	private final String avatar;

	public Profile(String email, String password) {
		this.email = email;
		this.password = password;
		this.avatar = null;
	}

	private Profile(String email, String password, String avatar) {
		this.email = email;
		this.password = password;
		this.avatar = avatar;
	}

	public static Profile createDefault(String email, String password) {
		return new Profile(email, password);
	}

	public static Profile createWithLogging(
			String email, String password, String avatar) {

		LOGGER.log(Level.INFO, "Date created: {0}", LocalTime.now());
		return new Profile(email, password, avatar);
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getAvatar() {
		return avatar;
	}

	@Override
	public String toString() {
		return "Profile{" +
				"email='" + email + '\'' +
				", avatar='" + avatar + '\'' +
				'}';
	}
}
