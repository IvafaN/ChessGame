package Exams.Week2.Arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    // Create an array that can hold ten integers,                                                                  // DONE
    // Fill each slot with a different random value from 1-50.                                                      // DONE
    // Display those values on the screen, and then prompt the user for an integer.                                 // DONE
    // Search through the array,
    //      If the item is present, give the slot number where it is located.                                       // DONE
    //      If the value is not in the array, display a single message saying so.                                   // DONE
    //      If the value is present more than once, you may either display the message as many times as necessary,  // DONE
    //          or display a single message giving the last slot number in which it appeared.                       // DONE
    //  Array: 45 39 32 12 44 50 42 26 16 20
    //  Value to find: 42
    //  42 is in slot 6.

    //  Array: 45 39 32 12 44 50 26 42 16 20
    //  Value to find: 43
    //  43 is not in the array.

    //  Array: 24 30 31 24 32 33 34 24 35 36
    //  Value to find: 24
    //    you may display either
    //  24 is in slot 0.
    //  24 is in slot 3.
    //  24 is in slot 7.
    //    or
    //  24 is in slot 7.
    public static void main(String[] args) {
        Random num = new Random();
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[10];
        boolean find  = false;

        for (int i = 0; i < myArray.length; i++) { myArray[i] = num.nextInt(50); }
        System.out.print("Array: "); for (int item: myArray) System.out.print(item+" ");
        System.out.println("\nValue to find: ");
        int value = input.nextInt();
        for (int i = 0; i < myArray.length; i++) {
            if (value==myArray[i]) {System.out.printf("%d is in slot %d\n",value, i); find=true; };
        }
        if (find==false) System.out.printf("%d is not in the array.", value);
    }
}
