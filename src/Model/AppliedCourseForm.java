package Model;

import java.util.Scanner;
public class AppliedCourseForm {
	
	private String resume;
	
	public static void displayForm(String name, String id, String staffType){
		
		System.out.println("Enter resume: " );
		Scanner scanner = new Scanner(System.in);
		String resume = scanner.nextLine();
		System.out.println("Your application : ");
		System.out.println("Resume: " + resume);
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("staffType: " + staffType);
	}

}
