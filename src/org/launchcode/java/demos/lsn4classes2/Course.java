package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String title;
    private Teacher instructor;
    private int credits;
    private ArrayList<Student> enrolledStudents;

    public Course(String title, Teacher instructor, int credits, ArrayList<Student> enrolledStudents) {
        this.title = title;
        this.instructor = instructor;
        this.credits = credits;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String title, Teacher instructor) {
        this.title = title;
        this.instructor = instructor;
        credits = 1;
    }

    // TODO: Add your custom 'toString' method here. Return a well-formatted String. Not just the class fields.
    @Override
    public String toString() {
        return "Course: " +
                "\n\tTitle: " + title +
                ", \n\tInstructor: " + instructor.getFirstName() + " " + instructor.getLastName() +
                ", \n\tCredits: " + credits +
                ", \n\tenrolledStudents: " + enrolledStudents;
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return title.equals(course.title) && instructor.equals(course.instructor);
    }

    // TODO: Add getters and setters using the "Generate" tool.
    @Override
    public int hashCode() {
        return Objects.hash(title, instructor);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public static void main(String[] args) {
        Teacher Phil = new Teacher("Phil", "Phillips", "Math", 5);
        Course class1 = new Course("Math", Phil);

        System.out.print(class1.toString());
    }
}
