package programs;

public class SecondLargest {

	public static void main(String[] args) {
		int numbers[] = { 10, 25, 89, 78, 90, 3, 45, 67 };
		int secondLargest = findSecondLargest(numbers);
		System.out.println("Second largest number in the array: " + secondLargest);

	}

	private static int findSecondLargest(int[] numbers) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		for (int num : numbers) {
			if (num > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = num;
				
				
			} else if (num > secondLargest && num != largest) {
				thirdLargest = secondLargest;
				secondLargest = num;
				
				
			} else if (num > thirdLargest && num != secondLargest && num != largest) {
				thirdLargest = num;
			}

		}
		return thirdLargest;

	}

}
