package Model;

public class Administrator extends User{

	private String approvedRequests;
	
	public void updateData() {};
	
	public void viewApprovals() {};
	
	public void viewMenu() {
		System.out.println("Model.Administrator actions:");
		System.out.println("1. Update data\n2. View approvals");
	}
}
