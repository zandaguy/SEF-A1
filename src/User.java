import java.util.Scanner;

public abstract class User {
	
	private String name;
	private String id;
	private String staffType;
	
	public User(String name, String id) {

		this.name = name;
		this.id = id;
		
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
