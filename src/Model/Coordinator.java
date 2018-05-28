package Model;

import java.util.ArrayList;

public class Coordinator extends User{

    private String course;

    private ArrayList<AppliedCourseForm> courseForms = new ArrayList<>();

    public void setupActivity() {}

    public void viewStaff() {}

    public void viewStaffApplication() {
        for(AppliedCourseForm forms: courseForms) {
            forms.toString();
        }
    }

    public void allocateStaff() {}

    public void sendCourseDetails() {}

    public ArrayList<AppliedCourseForm> getCourseForms() {
        return courseForms;
    }

    public void setCourseForms(ArrayList<AppliedCourseForm> courseForms) {
        this.courseForms = courseForms;
    }

    public String getCourse() {
        return course;
    }
}
