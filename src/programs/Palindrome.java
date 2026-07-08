package programs;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121; // Example number
        int rev = 0, originalNum = num;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        if (rev == originalNum) {
            System.out.println(originalNum + " is a palindrome");
        } else {
            System.out.println(originalNum + " is not a palindrome");
        }
    }
}
