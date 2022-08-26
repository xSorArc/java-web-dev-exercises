package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    // Class 2 Exercises Part 2
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8, 10, 12, 15, 20));
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Fiver", "Non-five", "One", "Four", "To"));

        System.out.println(sumEven(numbers));
        System.out.println(lengthFinder(words));
    }

    public static int sumEven(ArrayList<Integer> arr) {     // Ex.1
        int sum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static String lengthFinder(ArrayList<String> strArr) {       //Ex.2
        Scanner in = new Scanner(System.in);                            //Ex.3
        System.out.println("Please enter a word length: ");
        String input = in.next();

        for (String word : strArr) {
            if (word.length() == Integer.parseInt(input)) {
                System.out.println(word);
            }
        }
        return "";
    }
}
