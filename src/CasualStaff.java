
public class CasualStaff extends User{
	
	public void viewMenu() {
		System.out.println("Casual staff actions:");
		System.out.println("1. Apply for course\n2. Select availabilities\n3. View allocations");
	}
	
	public void selectAction() {
		
		int input = 0;
		while(input != 1 && input != 2 && input != 3) {
			input = readMenuInput();
		}
		
		if(input == 1) {
			applyCourse();
		} else if(input == 2) {
			setupAvailability();
		} else if(input == 3) {
			viewAllocation();
		}
		
	}
	
	public void applyCourse() {};
	public void setupAvailability() {};
	public void viewAllocation() {};
}
