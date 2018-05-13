package Model;

public class Coordinator extends User{

    public void setupActivity() {}

    public void viewStaff() {
    	AppliedCourseForm getNameObject = new AppliedCourseForm();
    	System.out.println("name: " +getNameObject.getName());
    }

    public void viewStaffApplication() {}

    public void allocateStaff() {}

    public void sendCourseDetails() {}

}
