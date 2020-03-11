package Exams.Week1.ForLoops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        /**
         * Write a program that gets an integer from the user. Count from 0 to that number. Use a for loop to do it.
         * Count to: 19
         * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
         * Count to: 8
         * 0 1 2 3 4 5 6 7 8
         * Count to: 25
         * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Count to: : ");
        int num = Integer.parseInt(in.nextLine());
        for (int i = 0; i < (num+1); i++) {
            System.out.print(i + " ");
        }
    }
}