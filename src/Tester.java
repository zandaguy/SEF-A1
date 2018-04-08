
public class Tester {
	public static void main(String[] args) {
		
		HRSystemDriver driver = new HRSystemDriver();
		
		Coordinator coordinator = new Coordinator();
		CasualStaff staff = new CasualStaff();
		
		driver.displayOptions(coordinator);
		driver.displayOptions(staff);
	}
}
