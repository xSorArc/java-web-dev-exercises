package Exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hi there! Question... How many miles have you driven today?");
        double miles = input.nextDouble();

        System.out.println("Great! Last question... How many gallons have you used to drive all those miles?");
        double gallons = input.nextDouble();

        double mpg = miles / gallons;
        System.out.println("By my calculations your mpg is " + mpg + ".");
    }
}
