package program3;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		int num, count = 0;
		System.out.println("Enter a number to check if it is a prime number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i = 2; i<num; i++) {
			if (num%i == 0) {
				count++;
				break;
			}
		}
		
		if (count == 0) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num + " is not a prime number");
		}

	}
}
