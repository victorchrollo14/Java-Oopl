package program1;

import java.util.Scanner;

class QuadraticEquation {
	public static void main(String[] args) {
		// quadratic equation program
		/*
		 * roots formulas
		 * z = b**2 - 4ac
		 * roots = (-b +/- z)2*a
		 */
		System.out.println("Enter the co-efficents of the quadratic equation"
				+ " ax2 + bx + c = 0, where a is not zero");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		if (a == 0) {
			System.out.println("a cannot be zero");
		} else {
			double b = sc.nextInt();
			double c = sc.nextInt();
			double z = (b * b) - (4 * a * c);
			sc.close();
			System.out.println(z);
			EquationCheck ob = new EquationCheck();
			if (z < 0) {
				System.out.println("Roots are imaginary");
			}

			else if (z == 0) {
				System.out.println("Roots are real and equal");
				ob.check(a, b, c);
			} else if (z > 0) {
				System.out.println("Roots are real and distinct");
				ob.check(a, b, c);
			}

		}
	} // end of main

}// end of class

class EquationCheck {
	double a;
	double b;
	double c;
	double r1, r2;

	void check(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		double z = (b * b) - (4 * a * c);
		r1 = (-b - z) / 2 * a;
		r2 = (-b + z) / 2 * a;
		System.out.println("roots are:" + r1 + ", " + r2);
	}

}
