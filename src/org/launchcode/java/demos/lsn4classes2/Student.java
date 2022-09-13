package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (numberOfCredits <= 29) {
            return "Freshman";
        } else if (numberOfCredits <= 59) {
            return "Sophomore";
        } else if (numberOfCredits <= 89) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        double qualityScore = grade * courseCredits;
        // Calculate current totalQualityScore by using (gpa * numberOfCredits).
        double totalQualityScore = this.gpa * this.numberOfCredits;

        // Update the appropriate fields: numberOfCredits, gpa
        totalQualityScore += qualityScore;                       // Use the grade & courseCredits to update totalQS.
        this.numberOfCredits += courseCredits;                   // Update the student’s total numberOfCredits.
        this.gpa = totalQualityScore / this.numberOfCredits;     // Compute their new GPA
    }

    // TODO: Add your custom 'toString' method here. Return a well-formatted String. Not just the class fields.
    @Override
    public String toString() {
        return "Student:" +
                "\n\tName: " + name +
                ",\n\tStudentId: #" + studentId +
                ",\n\tCredits: " + numberOfCredits +
                ",\n\tGPA: " + gpa;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match for Student object equality.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && name.equals(student.name);
    }

    public int hashCode() {
        return Objects.hash(name, studentId);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally", 1, 1, 4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}
