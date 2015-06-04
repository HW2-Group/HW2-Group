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

public class Student
{
	private String firstName;
	private String lastName;
	private double score;
	private SortedSet<Comment> comments = new TreeSet<>();//I'm not sure if a tree set is the right call... i want to creat a comments class so that we can make sure comments are ordered correctly
	
	public Student(String firstName, String lastName)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setScore(0);
		setComments();
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
		
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setScore(double score)
	{
		this.score = score;
	}
	
	public void setComments()
	{
		//
	}
}

public class Group
}
	private SortedSet<Student> students = new TreeSet<>();
	
	public Group()
	{
		//I'm not sure how to set this up to take however many students can be in a group
	}
}

public class Comments
{
	private String comment[];
	private int order;
	
	public Comments()
	{
		
	}
		
}
}