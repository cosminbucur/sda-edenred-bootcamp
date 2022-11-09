package com.sda.patterns.behavioral.iterator.challenge;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Item> items = List.of(
				new Item(ItemType.POTION, "Potion of healing"),
				new Item(ItemType.WEAPON, "Steel dagger"),
				new Item(ItemType.POTION, "Potion of mana"),
				new Item(ItemType.POTION, "Potion of strength"),
				new Item(ItemType.RING, "Gold ring"),
				new Item(ItemType.WEAPON, "Silver sword")
		);
		Inventory inventory = new Inventory(items);
		ItemIterator<Item> potionIterator = inventory.iterator(ItemType.POTION);
		while (potionIterator.hasNext()) {
			System.out.println(potionIterator.next().toString());
		}

		System.out.println("---");

		ItemIterator<Item> weaponIterator = inventory.iterator(ItemType.WEAPON);
		while (weaponIterator.hasNext()) {
			System.out.println(weaponIterator.next().toString());
		}
	}
}
