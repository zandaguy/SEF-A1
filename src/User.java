import java.util.Scanner;

public abstract class User {
	
	private String name;
	private String id;
	private String staffType;
	
	public void viewMenu() {};
	public void selectAction() {};
	
	public int readMenuInput() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a valid number to select action: ");
		int input = scanner.nextInt();
		
		return input;
	}
	
}
