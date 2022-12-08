package com.non.repeating.string;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class NonReperatingString {

	static final int NO_OF_CHARS = 256;
	static char count[] = new char[NO_OF_CHARS];

	public static void main(String[] args) {
		String leetCode = "geeksforgeeks";
		int index = firstNonRepeatingCharIndex(leetCode);
		System.out.println(index);
	}

	public static int firstNonReperating(String str) {

		int index = -1, i;
		getCharCountArrays(str);
		for (i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				index = i;
				break;
			}

		}
		return index;
	}

	private static void getCharCountArrays(String str) {
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

	}
    // O(n)
	public static int firstUniqChar(String str) {
		int a = 0;
		char b[] = str.toCharArray();
		for (char c : b) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				a = str.indexOf(c);
				break;
			} else {
				a = -1;
			}
		}
		return a;
	}
	
	public static int firstNonRepeatingCharIndex(String str) 
	{
	   LinkedHashSet<Character> lSet = new LinkedHashSet<>();
	   HashSet<Character> dupSet = new HashSet<>();   //duplicates list

	   for(char character : str.toCharArray()) 
	   {
	      if (dupSet.contains(character))  //exists in duplicates, continue
	          continue;         
	      if (lSet.contains(character))   //exists in the linkedSet, add to duplicates
	          dupSet.add(character);          
	      else
	          lSet.add(character);        //first time seen, add to linkedSet
	   } 

	   lSet.removeAll(dupSet);          //remove all duplicates 
	   if (lSet.isEmpty())
	        return -1;

	   return str.indexOf(lSet.iterator().next());  
	}
}
