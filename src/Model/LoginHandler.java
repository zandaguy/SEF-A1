package Model;

import java.util.Scanner;

public class LoginHandler {

  public void login() {
    Scanner input = new Scanner(System.in);
    
    String Username;
    String Password;
    
    System.out.println("Username: ");
    Username = input.nextLine();
    
    System.out.println("Password: ");
    Password = input.nextLine();

    
    if(Username.equals("...") && (Password.equals("..."))) {
            System.out.println("logged in");
    }else{
      System.out.println("Username/Password incorrect, please try again");
    }
    
  }
  
  
  
}
