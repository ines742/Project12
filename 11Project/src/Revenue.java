import java.util.*;

public class Revenue {

	public static void main(String[] args)
	{
	calculateSale();
	}

	static void calculateSale(){

	float unitprice;
	int quantity;
	float revenue=0f;
	float discountRate=0f;
	float discountAmount=0f;

	Scanner sc=new Scanner(System.in);
	System.out.print("Enter unit price:");
	unitprice = sc.nextFloat();
	System.out.print("Enter quantity:");
	quantity = sc.nextInt();

	
	if (quantity < 100)
	revenue = unitprice * quantity;
	else if (quantity >= 100 && quantity <= 120)
	{
	discountRate = (float)10/100;
	revenue = unitprice * quantity;
	discountAmount = revenue * discountRate;
	revenue -= discountAmount;
	}

	else if (quantity > 120)
	{
	discountRate = (float)15/100;
	revenue = unitprice * quantity;
	discountAmount = revenue * discountRate;
	revenue -= discountAmount;
	}

	System.out.println("The revenue from sale:" + revenue +"$");
	System.out.println("After discount:" + discountAmount + "$(" + discountRate*100 + "%)");

	 }
	
	
}
