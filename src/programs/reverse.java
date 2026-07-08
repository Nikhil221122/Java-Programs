package programs;

public class reverse {

	public static void main(String[] args) {
		int num = 12345; // Example number
        int rev = 0;

        while (num > 0) {
            int digit = num % 10; // Extract last digit
            rev = rev * 10 + digit; // Append digit to reversed number
            num /= 10; // Remove last digit
        }

        System.out.println("Reversed Number: " + rev);
    }
}

