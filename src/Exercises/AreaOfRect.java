package Exercises;

import java.util.Scanner;

public class AreaOfRect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number for length...");
        int length = input.nextInt();

        System.out.println("Please enter a number for width...");
        int width = input.nextInt();

        int area = length * width;
        System.out.println("Area of the rectangle is " + area + ".");
    }
}
