package Exams.Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        /**
         * Ask the user for their name. Then display their name to prove that you can recall it.
         * Ask them for their age. Then display what their age would be five years from now.
         * Then display what their age would be five years ago.
         *
         * Hello.  What is your name? Percy_Bysshe_Shelley
         * Hi, Percy_Bysshe_Shelley!  How old are you? 34
         * Did you know that in five years you will be 39 years old?
         * And five years ago you were 29! Imagine that!
         *
         * Hello.  What is your name? Gramps
         * Hi, Gramps!  How old are you? 87
         * Did you know that in five years you will be 92 years old?
         * And five years ago you were 82! Imagine that!
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Hello.  What is your name?"); //Percy_Bysshe_Shelley
        String name = in.nextLine();
        System.out.printf("Hi, %s!  How old are you?",name); //34
        int age = Integer.parseInt(in.nextLine());
        System.out.printf("Did you know that in five years you will be %d years old?\n" +
                "And five years ago you were %d! Imagine that!", age+5, age-5);
    }
}