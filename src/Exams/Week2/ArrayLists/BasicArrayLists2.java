package Exams.Week2.ArrayLists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BasicArrayLists2 {
    // Create an ArrayList of Integers.                                                  // DONE
    // Fill up the list with ten random numbers, each from 1 to 100.                     // DONE
    // Then display the contents of the ArrayList on the screen.                         // DONE
    //      You must use a loop to fill up the list.                                     // DONE
    //      However, you may display it the easy way (no loop needed) like so:           // DONE
    //      System.out.println( "ArrayList: " + whateverYourArrayListVariableIsCalled ); // DONE
    //      ArrayList: [45, 87, 39, 32, 93, 86, 12, 44, 75, 50]                          // DONE

    public static void main(String[] args) {
        Random num = new Random();
        ArrayList<Integer> myArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) { myArray.add(num.nextInt(100)); }
        System.out.println("Array: " + myArray.toString());
    }
}