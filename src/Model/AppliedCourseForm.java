package Model;

import java.util.Scanner;
public class AppliedCourseForm {
	
	private String resume;
	private String courseName;
	private String name;
	private String id;

	public AppliedCourseForm(String resume, String courseName, String name, String id) {
		this.resume = resume;
		this.courseName = courseName;
		this.name = name;
		this.id = id;
	}

	public void displayForm(){
		
		System.out.println("Enter resume: " );
		Scanner scanner = new Scanner(System.in);
		String resume = scanner.nextLine();
		System.out.println("Your application : ");
		System.out.println("Resume: " + resume);
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
	}

	public String toString() {
		return resume + "\n" + courseName + "\n" + name + "\n" + id;
	}

}
