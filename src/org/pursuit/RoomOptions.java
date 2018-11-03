package org.pursuit;

import java.util.Scanner;

public abstract class RoomOptions extends PlayOptions {

    public static String bedroom() {
        System.out.println("In the Bedroom you find a lamp, you pick it up, and it reads \n" +
                "'Find the magic words, to unlock the genie,'" +
                "You think to yourself,\n" +
                " 'hmmm.. magic words'\n" +
                " Please enter [L/R] to continue.");

        return backyardOrBasement();
    }

    public static String backyardOrBasement() {
        Scanner scanner = new Scanner(System.in);
        String bedroom1;
        bedroom1 = scanner.nextLine();
        bedroom1 = bedroom1.toUpperCase();

        String backyard;
        String word1 = "System.";


        if ((bedroom1.equals("L")) || (bedroom1.equals("R"))) {
            System.out.println("In the Backyard you see a fifty foot fence.  But there's a message. \n" +
                    "It reads, '" + word1 + "'  a Magic word!\n" +
                    "'  It's dark and scary, there's no exit, go back \n" +
                    "the other way. Please enter [L/R] to continue.");
        }
        return basement();
    }
    public static String basement() {
        String word3 = "println";
        System.out.println("In the Basement you hear banging from the boiler room, you go to check it out,\n " +
                "There's a book, you grab it, and inside you find another magic word, it reads: '" +
                word3 + "'  Whats your next move? Please enter [L/R] to continue.");

        return kitchen();
    }

    public static String kitchen() {

        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        input = input.toUpperCase();

        String word2 = "out.";
        System.out.println("In the kitchen you sense paranormal activity, theres a knife " +
                "lodged into a cutting board, on it, it reads: ' " + word2 + "' \n" +
                "A magic word! You grab it and save it for later \n"
                + "Please press [L/R] to continue");

        return attacked();
    }

    public abstract void startGame();
}
