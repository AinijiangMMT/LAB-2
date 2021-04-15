package labTwo;

import java.util.Scanner;

public class Q_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the charge for the meal:");
		double priceM = sc.nextDouble();
		double tax = priceM * 6.75 * 0.01;
		double tip = (priceM + tax) * 20 * 0.01;
		double total = priceM + tax + tip;

		System.out.println("your meal charge is: $" + priceM);
		System.out.println("your tax is : $" + tax);
		System.out.println("tips are : $" + tip);
		System.out.println("total amount you : $" + total);
	}

}
