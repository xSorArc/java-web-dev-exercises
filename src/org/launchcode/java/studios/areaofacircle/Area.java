package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        String r = input.next();

        while (Double.valueOf(r) < 0) {     // Prevents negative number input.
            System.err.println("Radius must be a positive number.");
            System.out.println("Enter a radius: ");
            r = input.next();
        }

        Double a = Circle.getArea(Double.valueOf(r));
        System.out.println("The area of a circle of radius " + r + " is: " + a);
    }
}
