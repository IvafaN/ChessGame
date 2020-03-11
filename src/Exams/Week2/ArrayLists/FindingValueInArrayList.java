package Exams.Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInArrayList {
    // Create an ArrayList that can hold Integers,
    // and fill each slot with a different random value from 1-50.
    // Display those values on the screen, and then prompt the user for an integer.
    // Search through the ArrayList, and if the item is present, say so.
    // It is not necessary to display anything if the value was not found.
    // If the item is in the ArrayList multiple times,
    // it's okay if the program prints the message more than once.
    //  ArrayList: [45, 39, 32, 12, 44, 50, 26, 42, 16, 20]
    //      Value to find: 42
    //      42 is in the ArrayList.

    //      ArrayList: [45, 39, 32, 12, 44, 50, 26, 42, 16, 20]
    //      Value to find: 43

    //      ArrayList: [24, 30, 31, 24, 32, 33, 34, 24, 35, 36]
    //      Value to find: 24
    //      24 is in the ArrayList.
    //      24 is in the ArrayList.
    //      24 is in the ArrayList.
    public static void main(String[] args) {
        Random num = new Random();
        ArrayList<Integer> myArray = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) { myArray.add(num.nextInt(50)); }
        System.out.println("ArrayList: " + myArray.toString());
        System.out.println("Value to find: ");
        int value = input.nextInt();
        for (int item: myArray)if (value == item) System.out.printf("%d is in the Arraylist.\n", value);
    }
}
