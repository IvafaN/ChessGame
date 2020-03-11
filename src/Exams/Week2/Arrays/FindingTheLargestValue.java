package Exams.Week2.Arrays;

import java.util.Random;

public class FindingTheLargestValue {
    // Write a program that creates an array which can hold ten values.                             // DONE
    // Fill the array with random numbers from 1 to 100.                                            // DONE
    // Display the values in the array on the screen.                                               // DONE
    // Then use a linear search to find the largest value in the array, and display that value.     // DONE
    //      Array: 45 87 39 32 93 86 12 44 75 50                                                    // DONE
    //      The largest value is 93                                                                 // DONE
    public static void main(String[] args) {
        Random num = new Random();
        int maxValue=0;
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) { myArray[i] = num.nextInt(100); }
        for (int item:myArray) { maxValue=(maxValue>item)?maxValue:item; }
        System.out.print("Array: "); for (int item: myArray) System.out.print(item+" ");
        System.out.printf("\nThe largest value is %d", maxValue);
    }
}
