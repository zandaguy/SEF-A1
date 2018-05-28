package Model;

import View.Menu;

public class HRSystemDriver {

	private User activeUser;
	private Menu menu = new Menu();
	private boolean loggedIn;

	public void runApplication() {

		while(true) {
			activeUser = login();
			loggedIn = true;

			while (loggedIn) {
				menu.displayOptions(activeUser);
				selectAction(menu.readMenuInput(), activeUser);
			}
		}
	}

	public User login() {
		User user = null;
		LoginHandler handler = new LoginHandler();

		while(user == null) {
			menu.displayUser();
			handler.setUsername(menu.readStringInput());
			menu.displayPass();
			handler.setPassword(menu.readStringInput());

			user = handler.login();

			if(user == null) {
				menu.displayMessage("Username or password incorrect");
			}
		}

		return user;
	}

	public void selectAction(int input, User user) {
		if(user.getClass().equals(CasualStaff.class)) {
			selectCasualAction(input, (CasualStaff) user);
		}
		if(user.getClass().equals(Coordinator.class)) {
			selectCoordAction(input, (Coordinator) user);
		}
		if(user.getClass().equals(Administrator.class)) {
			selectAdminAction(input, (Administrator) user);
		}
		if(user.getClass().equals(Approver.class)) {
			selectApproverAction(input, (Approver) user);
		}
	}

    public void selectCasualAction(int input, CasualStaff user) {

        if(input == 1) {
        	menu.displayMessage(user.applyCourse(new Coordinator(), "resume", "name", "id"));
        } else if(input == 2) {
            user.setupAvailability();
        } else if(input == 3) {
        	user.viewAllocation();
        } else if(input == 4) {
        	logout();
		}
    }

    public void selectAdminAction(int input, Administrator user) {

        if(input == 1) {
           	user.updateData();
        } else if(input == 2) {
        	user.viewApprovals();
        } else if(input == 3) {
        	logout();
        }
    }

   	public void selectCoordAction(int input, Coordinator user) {

		if(input == 1) {
		    user.allocateStaff();
        } else if(input == 2) {
		    user.setupActivity();
        } else if(input == 3) {
		    user.sendCourseDetails();
        } else if(input == 4) {
			logout();
		}
    }

    public void selectApproverAction(int input, Approver user) {

		if(input == 1) {
		    user.viewRequests();
        } else if(input == 2) {
			logout();
		}
    }

    public void logout() {
		loggedIn = false;
	}
}
