package labTwo;

import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter of cookies you ate:");
		int cookies = sc.nextInt();
		double calories = ((300 * 10.0) / 40) * cookies;
		System.out.println("you ate " + cookies + " and total calories you consumed is:" + calories + "j");

	}
}
