package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student me = new Student();

        me.setName("Tom Sawyer");
        me.setStudentId(001);
        me.setNumberOfCredits(1);
        me.setGpa(4.0);
    }

    public static class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;
    }

    public static class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getSubject() {
            return subject;
        }

        protected int getYearsTeaching() {
            return yearsTeaching;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public void setYearsTeaching(int yearsTeaching) {
            this.yearsTeaching = yearsTeaching;
        }
    }
}
