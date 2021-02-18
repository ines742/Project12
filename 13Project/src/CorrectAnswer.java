import java.io.*;
public class CorrectAnswer 

{
public static void main(String[] args)
{
   selectChoice();
}

static void selectChoice(){

char ans=' ';
System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
System.out.println("a. int 1x=10");
System.out.println("b. int x=10");
System.out.println("c. float x=10.0f");
System.out.println("d. string x=\"10\"");
System.out.print("Enter your answer:");
try{ ans = (char)System.in.read();

}
catch(IOException e){}; switch (ans)
{
case 'a': System.out.println("Wrong answer"); break;
case 'b': System.out.println("Congratulations!!!"); break;
case 'c': System.out.println("Wrong answer"); break;
case 'd': System.out.println("Wrong answer"); break;
default: System.out.println("Try again!");break;

}

}

}

