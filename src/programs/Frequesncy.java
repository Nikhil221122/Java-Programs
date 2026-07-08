package programs;

import java.util.HashMap;

public class Frequesncy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello world"; // Example string
		HashMap<Character, Integer> frequencyMap = new HashMap<>();

		// Convert string to character array
		for (char c : str.toCharArray()) {
			// If character is already in the map, increment its count
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}

		// Print the frequencies
		for (char c : frequencyMap.keySet()) {
			System.out.println(c + ": " + frequencyMap.get(c));
		}
	}
}
