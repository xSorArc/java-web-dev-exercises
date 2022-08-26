package Exercises;

import java.util.Arrays;

public class ArrayPractice {
    //Class 2 Exercises
    public static void main(String[] args) {
        int[] numArr = {1, 1, 2, 3, 5, 8};                  //Ex.1

        for (int num : numArr) {
            if (num % 2 != 0) {
                System.out.println(num + " is odd.");       //Ex.2
            }
        }

        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[] strArr = str.split(" ");                   //Ex.3
//        System.out.println(Arrays.toString(strArr));      //Ex.4

        String[] strArr2 = str.split("\\.");
        System.out.print(Arrays.toString(strArr2));         //Ex.5
    }
}
