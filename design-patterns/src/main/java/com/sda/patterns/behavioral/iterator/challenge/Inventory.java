package com.sda.patterns.behavioral.iterator.challenge;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

	private final List<Item> items;

	public Inventory(List<Item> items) {
		this.items = items;
	}

	public ItemIterator<Item> iterator(ItemType itemType) {
		return new InventoryItemIterator(this, itemType);
	}

	public List<Item> getItems() {
		return new ArrayList<>(items);
	}
}
