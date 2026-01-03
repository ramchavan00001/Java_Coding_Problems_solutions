package BestInterviewExamaples;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterFromString {

	// find first unique or non repeating character from string

	public static void main(String[] args) {
		String input = "caacbbzz";
		char uniqueChar = 0;
		boolean flag = false;

		Map<Character, Integer> freqMap = new LinkedHashMap<>();

		for (char ch : input.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);

		}

		for (char ch : input.toCharArray()) {
			if (freqMap.get(ch) == 1) {
				uniqueChar = ch;
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("first unique character: " + uniqueChar);
		} else {
			System.out.println("No unique characters");

		}

	}

}
