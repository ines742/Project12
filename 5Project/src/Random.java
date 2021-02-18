import java.util.Math;
import java.util.*; 


public class Random {
	
	public static void main(String [] args ) {
		int min = 1;
		int max = 6;
		
		//Generate random integer value between 1-6.
		System.out.println("Random value from "+ min + " to " + max );
		int random = (int)(Math.random()*(max - min + 1) + min);
		System.out.println(random);
	}
}
