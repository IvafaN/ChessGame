package Exams.Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        /**
         * Write a program that gets several integers from the user. Sum up all the integers they give you.
         * Stop looping when they enter a 0. Display the total at the end.
         *
         * You must use a while loop.
         *
         * I will add up the numbers you give me.
         * Number: 6
         * The total so far is 6
         * Number: 9
         * The total so far is 15
         * Number: -3
         * The total so far is 12
         * Number: 2
         * The total so far is 14
         * Number: 0
         * The total is 14.

         * I will add up the numbers you give me.
         * Number: 1
         * The total so far is 1
         * Number: 2
         * The total so far is 3
         * Number: 3
         * The total so far is 6
         * Number: 4
         * The total so far is 10
         * Number: 5
         * The total so far is 15
         * Number: 0
         * The total is 15
         */
        int sum=0;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Number: ");
            int num = Integer.parseInt(in.nextLine());
            if(num==0)
                break;
            else
                sum=sum+num;
            System.out.printf("The total so far is %d\n", sum);
        }
        System.out.printf("The total is %d", sum);
    }
}
