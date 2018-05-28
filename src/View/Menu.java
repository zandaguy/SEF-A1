package View;

import Model.*;

import java.util.Scanner;

public class Menu {

    public void displayUser() {
        System.out.println("Username: ");
    }

    public void displayPass() {
		System.out.println("Password: ");
	}

    public void displayAdminOptions() {
    	System.out.println("Administrator actions:");
		System.out.println("1. Update data\n2. View approvals\n3. Logout");
	}

    public void displayCoordinatorOptions() {
    	System.out.println("Coordinator actions:");
		System.out.println("1. Allocate staff\n2. Set up activity\n3. Send for approval\n4. Logout");
	}

    public void displayApproverOptions() {
        System.out.println("Approver actions:");
		System.out.println("1. View requests\n2. Logout");
	}

    public void displayCasualOptions() {
        System.out.println("Casual staff actions:");
		System.out.println("1. Apply for course\n2. Select availabilities\n3. View allocations\n4. Logout");
    }

    public void displayOptions(User user) {
		if(user.getClass() == CasualStaff.class) {
		    displayCasualOptions();
		}
		if(user.getClass() == Approver.class) {
		    displayApproverOptions();
		}
		if(user.getClass() == Coordinator.class) {
		    displayCoordinatorOptions();
		}
		if(user.getClass() == Administrator.class) {
		    displayAdminOptions();
		}
	}

	public int readMenuInput() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a valid number to select action: ");
		int input = scanner.nextInt();

		return input;
	}

	public String readStringInput() {
    	Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		return input;
	}

	public void displayMessage(String message) {
    	System.out.println(message);
	}



}
