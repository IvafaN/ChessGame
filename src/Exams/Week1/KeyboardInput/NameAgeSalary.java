package Exams.Week1.KeyboardInput;
import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        /**
         * Ask the user for their name. Then display their name to prove that you can recall it. Ask them for their age. Then display that. Finally, ask them for how much they make and display that. You should use the most appropriate data type for each variable.
         * Hello.  What is your name? -> Dennis
         * Hi, Dennis!  How old are you? -> 37
         * So you're 37, eh?  That's not old at all!
         * How much do you make, Dennis? -> 8.50
         * 8.5!  I hope that's per hour and not per year! LOL!
         *
         * Hello.  What is your name? -> Catsup
         * Hi, Catsup!  How old are you? -> 12
         * So you're 12, eh?  That's not old at all!
         * How much do you make, Catsup? -> 99.9
         * 99.9!  I hope that's per hour and not per year! LOL!
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        String name = in.nextLine();
        System.out.printf("Hi, %s!  How old are you?",name);
        String age = in.nextLine();
        System.out.printf("So you're %s, eh?  That's not old at all!\nHow much do you make, Dennis?", age);
        String price = in.nextLine();
        System.out.printf("%s!  I hope that's per hour and not per year! LOL!",price);
    }
}