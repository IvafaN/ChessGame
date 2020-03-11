package Exams.Week2.Arrays;
import java.util.Random;

public class BasicArrays2 {
    // Create an array that can hold ten integers.                          // DONE
    // Fill up each slot of the array with a random number from 1 to 100.   // DONE
    // Then display the contents of the array on the screen.                // DONE
    //  You must use a loop. And, like last time,                           // DONE
    //  you must use the length field of your array and not a literal number (like 10) in the condition of the loop. // DONE
    //      Slot 0 contains a 45
    //      Slot 1 contains a 87
    //      Slot 2 contains a 39
    //      Slot 3 contains a 32
    //      Slot 4 contains a 93
    //      Slot 5 contains a 86
    //      Slot 6 contains a 12
    //      Slot 7 contains a 44
    //      Slot 8 contains a 75
    //      Slot 9 contains a 50
    public static void main(String[] args) {
        Random num = new Random();
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) { myArray[i] = num.nextInt(100); }
        for (int i = 0; i < myArray.length; i++) { System.out.printf("Slot %d contains a %d\n", i, myArray[i]); }
    }
}
