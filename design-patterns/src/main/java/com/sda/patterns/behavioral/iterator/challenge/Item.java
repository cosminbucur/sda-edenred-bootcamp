package com.sda.patterns.behavioral.iterator.challenge;

public class Item {

	private final String name;
	private ItemType type;

	public Item(ItemType type, String name) {
		this.setType(type);
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public ItemType getType() {
		return type;
	}

	public final void setType(ItemType type) {
		this.type = type;
	}
}
