package com.ransom.note;

import java.util.Arrays;
import java.util.HashMap;

public class RansomNote {

	// Method using Arrays
	public boolean canConstruct(String ransomNote, String magazine) {
		int a[] = new int[26]; // find occurence of each character in string magazine
		for (char i : magazine.toCharArray()) {
			a[i - 'a']++;
		}
		for (char i : ransomNote.toCharArray()) {
			if (a[i - 'a'] == 0) { // character is not found in magazine or a particular character doesn't have
									// same or greater count than count in magazine
				return false;
			} else {
				a[i - 'a']--; // decrement if character exists
			}
		}
		return true;
	}

// Method using HashMap
	public boolean canConstructRansomNote(String ransomNote, String magazine) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char i : magazine.toCharArray()) {
			if (hm.containsKey(i)) {
				hm.put(i, hm.get(i) + 1);
			} else {
				hm.put(i, 1);
			}
		}
		for (char i : ransomNote.toCharArray()) {
			if (!hm.containsKey(i) || hm.get(i) == 0) {
				return false;
			} else {
				hm.put(i, hm.get(i) - 1);
			}
		}
		return true;
	}

	// Second Method Arrays
	public boolean canConstructRansom(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length())
			return false;
		int[] alphabets_counter = new int[26];

		for (char c : magazine.toCharArray())
			alphabets_counter[c - 'a']++;

		for (char c : ransomNote.toCharArray()) {
			if (alphabets_counter[c - 'a'] == 0)
				return false;
			alphabets_counter[c - 'a']--;
		}
		return true;
	}

	//
	public boolean canConstructRansome(String ransomNote, String magazine) {

		if (ransomNote == null || ransomNote.length() == 0)
			return true;
		  
		if (magazine == null || magazine.length() == 0)
			return false;
		boolean flag = false;
		boolean visited[] = new boolean[magazine.length()];
		Arrays.fill(visited, Boolean.FALSE);
		for (int i = 0; i < ransomNote.length(); i++) {
			flag = false;
			for (int j = 0; j < magazine.length(); j++) {
				if (ransomNote.charAt(i) == magazine.charAt(j) && !visited[j]) {
					visited[j] = true;
					flag = true;
					break;
				}
			}
		}
		return flag;
	}
}
