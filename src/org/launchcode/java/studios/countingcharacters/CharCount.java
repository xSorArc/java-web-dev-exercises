package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String userString = in.nextLine();
        String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two " +
                "terms has to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

//        cCount(hiddenFigures);
        cCount(userString.toLowerCase().replaceAll("[^a-zA-z]", ""));  // Still able to use " ^ ".
    }

    public static HashMap cCount(String str) {
        char[] charsInString = str.toCharArray();
        HashMap<Character, Integer> count = new HashMap<>();

        for (char c : charsInString) {
            if (!count.containsKey(c)) {
                count.put(c, 0);
            }
            count.put(c, count.get(c) + 1);
        }
        System.out.println(count);
        return count;
    }
}
