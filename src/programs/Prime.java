package programs;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.println("Enter Number to check");
		 Scanner sc = new Scanner(System.in);
		  int num = sc.nextInt();
		prime(num);
	}

	private static void prime(int num) {
		
		int i;
		if(num<=1) {
			System.out.println("Number is not a prime");
		}
		
		for(i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("Number is not a prime");
				break;
			}
		}
		if(num==i) {
			System.out.println("Number is a prime");
		}
		
	}
}
