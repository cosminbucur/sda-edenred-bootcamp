package com.sda.hibernate.hibernate.types;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.sda.hibernate.types.Address;
import com.sda.hibernate.types.Player;
import com.sda.hibernate.types.PlayerDao;
import com.sda.hibernate.types.Status;

public class DemoHibernateTypes {

	public static void main(String[] args) {
		com.sda.hibernate.types.PlayerDao playerDao = new PlayerDao();

		Address address = createAddress();
		com.sda.hibernate.types.Player player = createPlayer(address);

		playerDao.create(player);
	}

	private static com.sda.hibernate.types.Player createPlayer(Address address) {
		com.sda.hibernate.types.Player player = new Player();
		player.setUsername("jonsnow");
		player.setBirthDate(LocalDate.of(1980, 7, 21));
		player.setRegistrationTime(LocalDateTime.now());
		player.setAge(21);
		player.setStatus(Status.ACTIVE);
		player.setAddress(address);
		return player;
	}

	private static Address createAddress() {
		Address address = new Address();
		address.setAddressLine1("str Unirii 10");
		address.setAddressLine2("bl 1, ap 20");
		address.setCity("Bucharest");
		address.setCounty("Bucharest");
		address.setCountry("Romania");
		return address;
	}
}
