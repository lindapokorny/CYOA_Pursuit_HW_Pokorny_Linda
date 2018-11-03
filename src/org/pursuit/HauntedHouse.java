
package org.pursuit;

import java.util.Scanner;

public class HauntedHouse extends RoomOptions implements StartGame{

    @Override
    public static void startGame(){
runOrWeapons();
attacked();
weapons();
run();
bedroom();
kitchen();
backyardOrBasement();

        Scanner scanner = new Scanner(System.in);
        String location;

        do {
            System.out.println("Welcome to the Haunted House!  Please enter [R, D, U] and press enter to" +
                    " choose the direction in which you will go");

            String direction;
            direction = scanner.nextLine();
            direction = direction.toUpperCase();

            location = direction;


            System.out.println("You chose: " + direction);


            switch (direction) {
                case "R":
                    location = "Bedroom";
                    break;
                case "U":
                    location = "Bedroom";
                    break;
                case "D":
                    location = "Bedroom";
                    break;
                default:
                    location = "Invalid entry, try again!";
                    break;
            }
        } while (location.equals("Invalid entry, try again!"));


        System.out.println("You have entered the " + location);
        bedroom();
    } }
