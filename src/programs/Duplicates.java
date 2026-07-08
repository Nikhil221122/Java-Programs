package programs;

import java.util.HashSet;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 2, 6, 7, 8, 1 }; //s Example array

		HashSet<Integer> set = new HashSet<>();
		System.out.println("Duplicate elements in the array are:");

		// Iterate over the array
		for (int i = 0; i < arr.length; i++) {
			// If the element is already in the set, it's a duplicate
			if (!set.add(arr[i])) {
				System.out.println(arr[i]);
			}
		}

	}

}
