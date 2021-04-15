package labTwo;
import java.util.Scanner;
public class Q_4 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of MALE students in the class: ");
	int numM=sc.nextInt();
	System.out.println("Enter the number of FEMALE students in the class: ");
	
	int numF=sc.nextInt();
	
	int tot=numM+numF;
	double percentM=(numM*100.0/tot);
	double percentF=(numF*100.0/tot);
	System.out.println("Percentage of male students in the class: "+percentM+"%");
	System.out.println("Percentage of female students in the class: "+percentF+"%");
	
	
	
	}

}
