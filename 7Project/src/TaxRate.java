import java.util.Scanner;

public class TaxRate {

	int deposit;
	float interest;
	float tax, amount;
	
	public static void main (String [] args ) {
		TaxRate Tax = new TaxRate ();
		
		Tax.read();
		Tax.resolve();
		Tax.display();
	}
	
	public void read() {
		try (Scanner sc = new Scanner (System.in)){
		System.out.println("Enter the amount of deposit: ");
		deposit = sc.nextInt();
		System.out.println("Enter the amount of Year interest rate: ");
		interest = sc.nextFloat();
		System.out.println("Enter Income tax rate: ");
		tax = sc.nextFloat();
		}
	}
	
	public void resolve() {
		amount = deposit * interest * tax; //I had difficult resolving this problem, I couldn't find the formula.
	}
	
	public void display() {
		System.out.println("The amount of interest earned in the year is: " + amount);
	}
}
