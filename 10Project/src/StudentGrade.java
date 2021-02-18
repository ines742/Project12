import java.util.Scanner;

public class StudentGrade {

	int quiz;
	int midTerm;
	int finals, aver;
	
	
	public static void main (String [] args ) {
		
		StudentGrade Student = new StudentGrade();
		
		
		Student.readGrades();
		Student.display();
		Student.Average();
		Student.AverageScore();
		
	}
	public void readGrades() {
		try (Scanner sc = new Scanner (System.in)){
		System.out.println("Enter your quiz grade: ");
		quiz = sc.nextInt();
		System.out.println("Enter your grade for mid-term: ");
		midTerm = sc.nextInt();
		System.out.println("Enter your grade for final: ");
		finals = sc.nextInt();
		}
		}
		
	public void Average() {
		aver = (quiz + midTerm + finals)/3;
	}
	
	public void AverageScore() {
		if(aver>=90)
		{
			System.out.println("Your grade is A");
		}
		else
		{
			if (aver>=70 && aver <=90 )
			{
			System.out.println("Your grade is B");
		    }
		else 
		{
			if (aver>=50 && aver <=70) {
			System.out.println("Your grade is C");
		}
		else {
			System.out.println("Your grade is F");
		}
	}
}
	}
	
	
	public void display() {
		System.out.println("Quiz score: " + quiz);
		System.out.println("Mid-tern score: " + midTerm);
		System.out.println("Final score: " + finals);
		
	}
}
