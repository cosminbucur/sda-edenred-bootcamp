package com.sda.advanced.optional.nulls;

import java.util.Objects;

public class RequireNonNull {

	public static boolean containsVowels(String word) {
		// fail fast
		Objects.requireNonNull(word, "word should not be null");
		Objects.requireNonNull(word, RequireNonNull::creteMessage);

		String[] vowels = {"a", "e", "i", "o", "u"};

		for (int i = 0; i < 5; ++i) {
			// word / vowel null ?
			if (word.toLowerCase().contains(vowels[i])) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		containsVowels(null);
	}

	private static String creteMessage() {
		return "word should not be null";
	}
}
