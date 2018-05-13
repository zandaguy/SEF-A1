package Model;

import View.Menu;

public class HRSystemDriver {

	private User activeUser;
	private Menu menu = new Menu();

	public void runApplication() {

		menu.displayLogin();

		activeUser = login(new LoginHandler());

		menu.displayOptions(activeUser);
		selectAction(menu.readMenuInput());

	}

	public User login(LoginHandler handler) {
        return handler.login();
	}

	//TODO add timetable display, might cut this
	public void manageTimetable(Administrator user) {
		//menu.displayTimetable;
	}

	public void viewApprovals(Administrator user) {
		user.viewApprovals();
	}

	public void updateTimetable(Administrator user) {
		user.updateData();
	}

	public void allocateStaff(Coordinator user) {
		user.allocateStaff();
	}

	public void manageRequests(Coordinator user) {
		//TODO Add relevant class to coordinator
	}

	public void setupActivity(Coordinator user) {
		user.setupActivity();
	}

	public void applyForCourses(CasualStaff user) {
		user.applyCourse();
	}

	public void setAvailableTimes(CasualStaff user) {
		user.setupAvailability();
	}

	public void viewAllocations(CasualStaff user) {
		user.viewAllocation();
	}

    public void selectAction(int input) {

        if(input == 1) {
            applyForCourses((CasualStaff)activeUser);
        } else if(input == 2) {
            setAvailableTimes((CasualStaff)activeUser);
        } else if(input == 3) {
            viewAllocations((CasualStaff)activeUser);
        }
    }
}
