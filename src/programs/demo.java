package programs;

import java.util.HashMap;
import java.util.HashSet;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hellow World";
		s= s.toLowerCase();
		HashMap<Character,Integer> frequency = new HashMap<>();
		
		for(char c: s.toCharArray()) {
			frequency.put(c, frequency.getOrDefault(c, 0)+1);
		}
		
		for(char c : frequency.keySet()) {
			System.out.println("charecter "+c+" is printed " + frequency.get(c)+" times");
		}
		
}}
