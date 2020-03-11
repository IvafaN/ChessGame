package Exams.Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class GettingTheLargestValue {
    //Write a program that creates an ArrayList which can hold Integers. Fill the ArrayList with random numbers from 1 to 100. Display the values in the ArrayList on the screen. Then use a linear search to find the largest value in the ArrayList, and display that value.
    //  ArrayList: [45, 87, 39, 32, 93, 86, 12, 44, 75, 50]
    //  The largest value is 93
    public static void main(String[] args) {
        Random num = new Random();
        int maxValue=0;
        ArrayList<Integer> myArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) { myArray.add(num.nextInt(100)); }
        for (int item:myArray) maxValue=(maxValue>item)?maxValue:item;
        System.out.println("Array: " + myArray.toString());
        System.out.printf("The largest value is %d", maxValue);
    }
}
