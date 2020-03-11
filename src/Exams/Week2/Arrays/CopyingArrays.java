package Exams.Week2.Arrays;

import java.util.Arrays;
import java.util.Random;

public class CopyingArrays {
    // Write a program that creates an array of ten integers.                               // DONE
    // It should put ten random numbers from 1 to 100 in the array.                         // DONE
    // It should copy all the elements of that array into another array of the same size.   // DONE
    // Then display the contents of both arrays. To get the output to look like mine, you'll need a several for loops.
    //    Create an array of ten integers                                                   // DONE
    //    Fill the array with ten random numbers (1-100)                                    // DONE
    //    Copy the array into another array of the same capacity                            // DONE
    //    Change the last value in the first array to a -7                                  // DONE
    //    Display the contents of both arrays                                               // DONE
    //      Array 1: 45 87 39 32 93 86 12 44 75 -7                                          // DONE
    //      Array 2: 45 87 39 32 93 86 12 44 75 50                                          // DONE
    public static void main(String[] args) {
        Random num = new Random();
        int[] myArray     = new int[10];
        int[] myArrayCopy = new int[10];
        for (int i = 0; i < myArray.length; i++) { myArray[i]     = num.nextInt(100); }
        for (int i = 0; i < myArray.length; i++) { myArrayCopy[i] = myArray[i]; }
        myArray[myArray.length-1]=-7;
        System.out.print(  "Array 1: "); for (int item: myArray)     { System.out.print(item+" "); }
        System.out.print("\nArray 2: "); for (int item: myArrayCopy) { System.out.print(item+" "); }
    }
}
