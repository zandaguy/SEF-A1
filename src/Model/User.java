package Model;

import java.util.Scanner;

public class user {

		private String name;
		private String staffType;
		private String username;
		private String password;
		private String[][] account = {{"jesper", "abc123","casualStaff"},{"christian", "abc123","approver"}};

		public user(String user, String pass, String staff){
		    username = user;
		    password = pass;
		    staffType = staff;
		}

		public boolean req(){
			if((username.equals(account[0][0])) && (password.equals(account[0][1])))
		        return true;
		    else
		        return false;
		}
	
		public void viewMenu() {};
		public void selectAction() {};
	
		public int readMenuInput() {
			Scanner scanner = new Scanner(System.in);
		
			System.out.print("Enter a valid number to select action: ");
			int input = scanner.nextInt();
		
			return input;
	}

		
}
