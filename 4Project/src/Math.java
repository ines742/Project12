import java.util.Scanner;

public class Math {
//Attributes.
	int num1, num2;
	int sum;
	int subtracting;
	int multiplying;
	int dividing;
	
	//Method for asking the 2 integers. 
	public void readNum() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number 1: ");
		num1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		num2 = sc.nextInt();
	}
		public void Add() {
			sum = num1 + num2;
		}
		
		public void Subtract() {
			subtracting = num1 - num2;
		}
		
		public void Multiply() {
			multiplying = num1 * num2;
		}
		
		public void Divide() {
			dividing = num1 / num2;
		}
		
		public void Display() {
			System.out.println("Adding is " + sum);
			System.out.println("Subtracting is " + subtracting);
			System.out.println("Multiplying is " + multiplying);
			System.out.println("Dividing is " + dividing);
			
		}
	

	  

}
