package com.semanticsquare.thrillio.constants;

public enum Gender {
	  MALE (0),
	  FEMALE (1),
	  TRNASGENDER (2);

	private Gender(int value) {
		this.value = value;
	}

	private int value;

	public int getValule() {
		return value;
	}
}
