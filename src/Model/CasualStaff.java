package Model;

public class CasualStaff extends User{

	public void applyCourse() {
		AppliedCourseForm object = new AppliedCourseForm();
		String name = "name";
		String id = "e000000";
		String staffType = "Casual";
		AppliedCourseForm.displayForm(name, id, staffType);
	};
	public void setupAvailability() {};
	public void viewAllocation() {};
}
