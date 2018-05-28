package Model;

public class CasualStaff extends User{

	public String applyCourse(Coordinator coordinator, String resume, String name, String id) {
		AppliedCourseForm form = new AppliedCourseForm(resume, coordinator.getCourse(), name, id);
		coordinator.getCourseForms().add(form);
		return form.toString();
	};
	public void setupAvailability() {};
	public void viewAllocation() {};
}
