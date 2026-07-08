package programs;

public class Search {

	public static void main(String[] args) {
		
		int[] arr = { 12, 35, 1, 10, 34, 1 }; 
		int target = 34; 
		boolean found = false; 
		
		// Loop through each element of the array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) { // If the element matches the target
				System.out.println("Element found at index: " + i);
				found = true;
				break; // Exit the loop since the element is found
			}
		}

		if (!found) { // If element is not found
			System.out.println("Element not found in the array");
		}
	}

}
