package Exams.Week1.Variables;
public class StillUsingVariables {
    public static void main(String[] args) {
        /**
         * Write a program that stores your name and year of graduation into variables, and displays their values on the screen.
         * Make sure that you use two variables, and that the variable that holds your name is the best type for such a variable, and that the variable that holds the year is the best type for that variable.
         * Also make sure that your variable names are good: the name of a variable should always relate to its contents.
         *
         * Sample Output: My name is Juan Valdez and I'll graduate in 2010.
         *
         * Notice that in the example above, the values "Juan Valdez" and 2010 have been stored in variables before printing.
         * You're doing it wrong if your program looks like this:
         * 	System.out.println( "My name is Juan Valdez and I'll graduate in 2010." );
         */
        String name = "Hermilo Ortega";
        int year = 2021;
        System.out.printf("My name is %s and I'll graduate in %d.", name, year);
    }
}