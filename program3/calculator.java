package program3;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		int a, b, opt;
		System.out.println("arithematic calculator");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter first number: ");
		a = sc.nextInt();
		System.out.println("Enter the second Number");
		b = sc.nextInt();

		System.out.println("\nChoose the operator");
		System.out.println("a: addition\ns: substraction"
				+ "\nm: multiplication\nd: Division");

		opt = sc.next().charAt(0);
		sc.close();
		switch (opt) {
			case 'a':
				System.out.println("the addition is: " + (a + b));
				break;
			case 's':
				System.out.println("Subtraction: " + (a - b));
				break;
			case 'm':
				System.out.println("multiplication: " + (a * b));
				break;
			case 'd':
				System.out.println("Division: " + (a / b));
				break;
			default:
				System.out.println("Wrong option");
		}
	}
}
