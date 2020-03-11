package Exams.Week1.IfStatements;
import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        /**
         * Using if statements, else if, and else statements, make a program which displays a
         * different message depending on the age given.
         * age 	message
         * less than 16 "You can't drive."
         * 16 to 17 	"You can drive but not vote."
         * 18 to 24 	"You can vote but not rent a car."
         * 25 or older 	"You can do pretty much anything."
         * Note that unlike the original "How Old Are You" assignment, this program must only display
         * exactly one message for a given age and not multiple messages.

         * Hey, what's your name? (Sorry, I keep forgetting.) Billy_Corgan
         * Ok, Billy_Corgan, how old are you? 17
         * You can drive but you can't vote, Billy_Corgan.

         * Hey, what's your name? (Sorry, I keep forgetting.) Billy_Corgan
         * Ok, Billy_Corgan, how old are you? 14
         * You can't drive, Billy_Corgan.

         * You can make up your own messages if you want, but you must have at least four messages, and you must use else if statements to make sure only one of the messages is printed for any given age.
         */
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Hey, what's your name? (Sorry, I keep forgetting.) Billy_Corgan\n" +
                "Ok, Billy_Corgan, how old are you?");
        int age = Integer.parseInt(in.nextLine());
        String message = "";
        if (age < 16) { message = "You can't drive."; }
        else if(age >= 16 && age <= 17){ message = "You can drive but not vote."; }
        else if(age >= 18 && age <= 24){ message = "You can vote but not rent a car."; }
        else if(age >=25){ message = "You can do pretty much anything."; }
        System.out.printf(message);
    }
}