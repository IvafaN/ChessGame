package Exams.Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class LocatingTheLargestValue {
    // Write a program that creates an ArrayList of Integers. Fill the ArrayList with random numbers from 1 to 100. Display the values in the ArrayList on the screen. Then use a linear search to find the largest value in the ArrayList, and display that value and its slot number.
    //      ArrayList: [45, 87, 39, 32, 93, 86, 12, 44, 75, 50]
    //      The largest value is 93, which is in slot 4
    public static void main(String[] args) {
        Random num = new Random();
        int maxValue=0, slotMaxValue=0;
        ArrayList<Integer> myArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) { myArray.add(num.nextInt(100)); }
        for (int i =0; i < 10; i++){
            maxValue    =(maxValue> myArray.get(i))?maxValue : myArray.get(i);
            slotMaxValue=(maxValue> myArray.get(i))?slotMaxValue : i;
        }
        System.out.println("Array: " + myArray.toString());
        System.out.printf("The largest value is %d, which is in slot %d", maxValue, slotMaxValue);
    }
}