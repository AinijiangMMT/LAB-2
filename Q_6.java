package labTwo;
import java.util.Scanner;
public class Q_6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount of the purchase:");
		double amountP=sc.nextDouble();
	 double stateST=amountP*4*0.01;
	 double countyST=amountP*2*0.01;
	double totSalesTax=stateST+countyST;
	double totSale=amountP+totSalesTax;
	System.out.println("-----------------------------------");
	System.out.println("amount of the purchase: $"+amountP);
	System.out.println("the state sales tax: $"+stateST);
		System.out.println("the county sales tax: $"+countyST);
	System.out.println("total sales tax: $"+totSalesTax);
	System.out.println("total of the sale: $"+totSale);
	}

}
