package com.sda.patterns.creational.builder.ex1;

public class House {

	private String foundation;
	private String structure;
	private String roof;

	public String getFoundation() {
		return foundation;
	}

	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	@Override
	public String toString() {
		return "House{" +
				"foundation='" + foundation + '\'' +
				", structure='" + structure + '\'' +
				", roof='" + roof + '\'' +
				'}';
	}
}
