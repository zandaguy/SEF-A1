package Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginHandler {

  private String username;
  private String password;

  public User login() {
    Scanner input = new Scanner(System.in);
    ArrayList<String> users = new ArrayList<>();
    String userInfo[] = null;

    try {
      BufferedReader br = new BufferedReader(new FileReader("users.txt"));

      String user = "";

      while((user = br.readLine()) != null) {
        users.add(user);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    boolean correctEntry = false;

    for (String user: users) {
      String[] parts = user.split(" ");
      if(username.equals(parts[0]) && password.equals(parts[1])) {
        userInfo = parts;
        correctEntry = true;
      }
    }

    if(correctEntry) {
      if(userInfo[2].equals("CasualStaff")) {
        return new CasualStaff();
      }else if(userInfo[2].equals("Administrator")) {
        return new Administrator();
      }else if(userInfo[2].equals("Coordinator")) {
        return new Coordinator();
      }
    }

    return null;
  }
  
  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  
}
