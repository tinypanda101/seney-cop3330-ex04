/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Seney
 */

import java.util.Scanner;

public class MadLib {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a noun:");
        String noun = scanner.nextLine();

        System.out.println("Enter a verb:");
        String verb = scanner.nextLine();

        System.out.println("Enter an adjective:");
        String adjective = scanner.nextLine();

        System.out.println("Enter an adverb:");
        String adverb = scanner.nextLine();

        String finalStory;

        finalStory = String.format("Do you %s your %s %s %s?", new Object[]{verb, adjective, noun, adverb});

        System.out.println(finalStory);
    }

}