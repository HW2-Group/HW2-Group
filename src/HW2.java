import java.io.Console;
import java.util.Random;
import java.util.Scanner;


public class HW2
{
    public static void main(String[] args)
    {
    	int x = 0;
    	while(x < 11)
    	{
	        String student1 = "Student1: ";
	        String student1Response[] = {"I like pie.", "Hello, my name is", "Java's got nothing on me", "OOP is not always the solution", "Blastoff! (straight from the book, here)", "Floating point errors are completely avoidable."};
	        System.out.print(student1);
	
	        Random r = new Random();
	        System.out.println(student1 + student1Response[r.nextInt(6)]);
	        x++;
    	}

    }
}

public class student
{
	
}