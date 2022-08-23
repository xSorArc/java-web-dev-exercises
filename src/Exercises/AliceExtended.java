package Exercises;

import java.util.Scanner;

public class AliceExtended {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String story = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures " +
                "or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Please enter a term from within the story...");
        String term = input.next();

        if (story.toLowerCase().contains(term.toLowerCase())) {
            String result = "Search term found: true";
            System.out.println(result);

            System.out.println("Index: " + story.indexOf(term));
            System.out.println("Length: " + term.length());

            String modifiedStory = story.toLowerCase().replace(term, "");
            System.out.println(modifiedStory);

        } else {
            String result = "Search term found: false";
            System.out.println(result);
        }
    }
}
