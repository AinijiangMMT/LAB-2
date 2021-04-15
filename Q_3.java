package labTwo;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		System.out.println("Enter a positive intiger number");
		do {

			int num = sc.nextInt();

			if (num <= 0) {
				System.out.println("number is invalid, please re-enter a positive number");

			} else {
				for (int i = 1; i <= num; i++) {
					sum = sum + i;
					if (i == num) {
						System.out.println("sum of the numbers are :" + sum);
					} else {
						continue;
					}
				}
			}

		} while (true);

	}
}
