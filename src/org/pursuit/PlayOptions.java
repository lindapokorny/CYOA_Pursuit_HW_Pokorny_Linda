package org.pursuit;

import java.util.Scanner;

public class PlayOptions {

    public static String attacked() {
        String attacked2;
        Scanner scanner = new Scanner(System.in);
        attacked2 = scanner.nextLine();
        attacked2 = attacked2.toUpperCase();

        if (attacked2.equals("L") || attacked2.equals("R") || attacked2.equals("U") || attacked2.equals("D")) {
            System.out.println("OH no! Zombie dogs!  And they're coming right for you, " +
                    "do you 1) run or 2) choose a weapon?");
        }
        return runOrWeapons();
    }

    public static String weapons() {
        System.out.println("Your choices are knife, lamp or book");
        Scanner scanner = new Scanner(System.in);
        String weapons = scanner.next();
        weapons = weapons.toLowerCase();
        String knife = "A knife, good choice!";
        String lamp = "You chose a lamp?!  A genie comes out; automatic win!";
        String book = "A book?";
        String loser ="\n"+
                "   _____                         ____                 \n" +
                "  / ____|                       / __ \\                \n" +
                " | |  __  __ _ _ __ ___   ___  | |  | |_   _____ _ __ \n" +
                " | | |_ |/ _` | '_ ` _ \\ / _ \\ | |  | \\ \\ / / _ \\ '__|\n" +
                " | |__| | (_| | | | | | |  __/ | |__| |\\ V /  __/ |   \n" +
                "  \\_____|\\__,_|_| |_| |_|\\___|  \\____/  \\_/ \\___|_|   \n" +
                "                                                      \n" +
                "                                                      \n"


;
        String winner = "\n" +
                " __          ___                       _ \n" +
                " \\ \\        / (_)                     | |\n" +
                "  \\ \\  /\\  / / _ _ __  _ __   ___ _ __| |\n" +
                "   \\ \\/  \\/ / | | '_ \\| '_ \\ / _ \\ '__| |\n" +
                "    \\  /\\  /  | | | | | | | |  __/ |  |_|\n" +
                "     \\/  \\/   |_|_| |_|_| |_|\\___|_|  (_)\n" +
                "                                         \n" +
                "                                         \n";
        switch (weapons) {
            case "knife":
                System.out.println(knife + "A giant spider jumps out at you, and you lodge your knife into his eye!");
                break;
            case "lamp":
                System.out.println("You chose the lamp?!  A genie comes out, and you wish yourself out of this mess! Automatic win!" + winner);
                for (int i = 0; i < winner.length(); i++)
                break;
            case "book":
                System.out.println("Seriously!? A book?  This is not what your parents meant when they said pick up a book! Game over!");
                for (int i = 0; i < loser.length(); i++)
                break;//this is where i show you guys how corny i am.
            default:
                weapons = "None of those in sight, game Over!";
        }
        return weapons;
    }

    public static String runOrWeapons() {
        Scanner scanner = new Scanner(System.in);
        String runOrWeapons = scanner.nextLine();
        runOrWeapons = runOrWeapons.toLowerCase();
        if (runOrWeapons.charAt(0) == '1' || runOrWeapons.charAt(0) == 'r') {
            run();
        } else if (runOrWeapons.charAt(0) == '2' || runOrWeapons.charAt(0) == 'c' ||
                runOrWeapons.charAt(0) == 'w') {
            weapons();
        }
        return runOrWeapons;
    }

    public static void run() {
        System.out.println("Coward! You run, and fall right into a ditch.  Do you have the will to go on? [Y/N]");
        String answer;
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        answer = answer.toUpperCase();
        if (answer.equals("Y")) {
            System.out.println("Where there's a will, there's a way \n"
                    + " You take off your clothes, tie them into a rope, and pull yourself out of the ditch.\n" +
                    "  Now you're stranded in undies, but at least you're out of the hole, \n" +
                    "Do you Scream? or Find help?");
            String screamOrHelp;
            Scanner scanner1 = new Scanner(System.in);
            screamOrHelp = scanner1.nextLine();
            screamOrHelp = screamOrHelp.toUpperCase();
            switch (screamOrHelp) {
                case "SCREAM":
                    System.out.println("You just drew unwanted " +
                            "attention to yourself, you've been arrested for public indecency, game Over!");
                    break;
                case "FIND HELP":
                    System.out.println("You find your friend and get into their car," +
                            " safely driving away from this stressful night, you win!");
            }
        } else {
            System.out.println("Game Over.");
        }
    }
}
