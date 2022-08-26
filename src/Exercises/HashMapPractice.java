package Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newStudentID = 0;
        String newStudentName;

        System.out.println("Enter your students (or ENTER to finish");

        do {
            System.out.println("Student name: ");
            newStudentName = in.nextLine();

            if (!newStudentName.equals("")) {
                newStudentID++;
                students.put(newStudentID, newStudentName);
            }
        } while (!newStudentName.equals(""));

        System.out.println("Class roster:\n");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + ": ID#00" + student.getKey());
        }

        System.out.println("Number of students in roster: " + students.size());
    }
}
