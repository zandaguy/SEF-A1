package Model;

public class Tester {
	public static void main(String[] args) {
		
		HRSystemDriver driver = new HRSystemDriver();
		
		Coordinator coordinator = new Coordinator();
		CasualStaff staff = new CasualStaff();
		Administrator admin = new Administrator();
		Approver approver = new Approver();
		
		//driver.displayOptions(coordinator);
		driver.displayOptions(staff);
		//driver.displayOptions(admin);
		//driver.displayOptions(approver);
	}
}
