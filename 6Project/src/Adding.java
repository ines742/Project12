import java.util.Scanner;


public class Adding {

	float num1;
	float num2;
	float sum;
	
	public void readNum6() {
		try (Scanner sc = new Scanner (System.in)){
		System.out.println("Enter a number: ");
		num1 = sc.nextFloat();
		System.out.println("Enter a number: ");
		num2 = sc.nextFloat();
		}
	}
	public void add6 () {
		sum = num1 + num2;
	}
	
	public void display6() {
		System.out.println("The value of a before adding is " + num1);
		System.out.println("The value of b is " + num2);
		System.out.println("The value of a after adding is " + sum);
	}
}
