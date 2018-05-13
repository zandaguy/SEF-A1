package View;

import Model.*;

import java.util.Scanner;

public class Menu {

    public void displayLogin() {

    }

    public void displayAdminOptions() {
    	System.out.println("Model.Administrator actions:");
		System.out.println("1. Update data\n2. View approvals");
	}

    public void displayCoordinatorOptions() {
    	System.out.println("Course Model.Coordinator actions:");
		System.out.println("1. Allocate staff\n2. Set up activity\n3. Send for approval");
	}

    public void displayApproverOptions() {
        System.out.println("Model.Approver actions:");
		System.out.println("1. View requests");
	}

    public void displayCasualOptions() {
        System.out.println("Casual staff actions:");
		System.out.println("1. Apply for course\n2. Select availabilities\n3. View allocations");
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



}
