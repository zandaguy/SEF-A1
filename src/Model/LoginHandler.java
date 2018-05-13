package Model;

import java.util.Scanner;

public class LoginHandler {

	    Scanner input = new Scanner(System.in);

	    String id;
	    String password;
	    String staff = null;

	    System.out.println("Log in");
	    System.out.println("Username: ");
	    id = input.nextLine();

	    System.out.println("Password: ");
	    password = input.nextLine();

	    user check = new user(id, password, staff);

	    if(check.req()) 
	        System.out.println("You are logged in");
	    else 
	    	System.out.println("You are not logged in");



	}
	
  
  
  
}
