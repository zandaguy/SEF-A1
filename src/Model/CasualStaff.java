package Model;
import java.util.Scanner;

import View.Menu;

public class CasualStaff extends User{
	
	public void applyCourse() {
		AppliedCourseForm formObject = new AppliedCourseForm();
		HRSystemDriver driverObject = new HRSystemDriver();
		String name = "name";
		String id = "e000000";
		String email = "name@gmail.com";
		String staffType = "Casual";
		formObject.displayForm(name, id, email, staffType);
		
		System.out.println("Send Application? \n 1. yes 2. cancel");
		Scanner scanner = new Scanner(System.in);
		int answer = scanner.nextInt();
		
		formObject.setName(name);
		
		if(answer==1){
			System.out.println("Application sent");
			formObject.setName(name);
			//formObject.sendForm();
		}
		else{
			driverObject.runApplication();
		}
	}
	public void setupAvailability() {};
	public void viewAllocation() {};
}
