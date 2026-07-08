package programs;

public class Largestinarray {

	public static void main(String[] args) {
		int numbers[] = {10, 25, 78, 90, 3, 45, 67};
		int max = findLargest(numbers); 
        System.out.println("Largest number in the array: " + max);

	}

	private static int findLargest(int[] numbers) {
		int max = numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>max) {
				  max = numbers[i];
			}
		}
		return max;
		
	}

}
