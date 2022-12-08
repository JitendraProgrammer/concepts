/**
 * 
 */
package com.string.anagram;

import java.util.Arrays;

/**
 * @author PSQ-20-5
 *
 */
public class Anagram {

	public static void main(String[] args) {
		boolean bool = anagram("app", "ppa");
		System.out.println(bool);
	}

	public static boolean anagram(String first, String second) {
		first = first.replaceAll("\\s", "").toLowerCase();
		second = second.replaceAll("\\s", "").toLowerCase();
		if (first.length() != second.length()) {
			return false;
		}
		String firstSort = sortString(first);
		String secondSort = sortString(second);

		return firstSort.equals(secondSort);
	}

	private static String sortString(String second) {
		char chars[] = second.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

}
