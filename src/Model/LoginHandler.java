package Model;

import java.util.Scanner;

public class LoginHandler {

  public User login() {
    Scanner input = new Scanner(System.in);
    
    String Username;
    String Password;
    
    System.out.println("Log in");
    System.out.println("Username: ");
    Username = input.nextLine();
    
    System.out.println("Password: ");
    Password = input.nextLine();

    user check = new user(Username, Password);
    
    if(chek.auth())
        System.out.println("You are now logged in");
    
    
  }
  
  
  
}
