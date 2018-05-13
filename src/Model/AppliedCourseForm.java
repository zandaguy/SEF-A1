package Model;

import java.util.Scanner;
public class AppliedCourseForm {
	//rename the variables to match class diagram
	private String name;
	
	public static void displayForm(String name, String id, String email,
									String staffType){
		System.out.println("Enter course you are applying for: ");
		Scanner scanner = new Scanner(System.in);
		String course = scanner.nextLine();
		System.out.println("Enter your availability: ");
		String availability = scanner.nextLine();
		System.out.println("Enter resume: " );
		String resume = scanner.nextLine();
		System.out.println("-----------------");
		System.out.println("Your Application: ");
		System.out.println("-----------------");
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("email: " + email);
		System.out.println("staffType: " + staffType);
		System.out.println("Course applied to: " + course);
		System.out.println("Availability " + availability);
		System.out.println("Resume: " + resume);
	}
	
	public void setName(String name)
	{
	    this.name = name;
	}
	
	public String getName()
	{
	    return this.name;
	}
	
	public static void sendForm(){
		
	}

}
