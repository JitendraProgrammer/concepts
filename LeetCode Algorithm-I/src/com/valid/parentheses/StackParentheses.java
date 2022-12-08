package com.valid.parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackParentheses {
	//"()"
	public static void main(String[] args) {
		String stack = "(){";
		boolean bool = isValid(stack);
		System.out.println(bool);
	}

	public static boolean isValid(String s) {    
	    Map<Character, Character> parenthesesMapping = new HashMap<>();
	    parenthesesMapping.put('(', ')');
	    parenthesesMapping.put('{', '}');
	    parenthesesMapping.put('[', ']');

	    Stack<Character> parentheses = new Stack<>();
	    for(int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if(parenthesesMapping.containsKey(c)) {
	            parentheses.push(c);    
	        } else {
	            if(parentheses.isEmpty()) {
	                return false;
	            }
	            char target = parentheses.pop();
	            if(!parenthesesMapping.containsKey(target) || parenthesesMapping.get(target) != c) {
	                return false;
	            }
	        }
	    }
	    if(!parentheses.isEmpty()) {
	        return false;
	    }
	    return true;
	  }

}
