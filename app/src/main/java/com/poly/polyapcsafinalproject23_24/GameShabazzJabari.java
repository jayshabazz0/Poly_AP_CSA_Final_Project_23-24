package com.poly.polyapcsafinalproject23_24;

import java.util.Scanner;

public class GameShabazzJabari extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)


    public void run()
    {
        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        Util.clearConsole();
        System.out.println("ZOMBIE APOCALYPSE!");
        System.out.println("A zombie apocalypse breaks out and you have to decide on what path you want to take for your own survival.");

        Util.pauseConsole();
        start();
    }

    private void start()
    {
        Util.clearConsole();
        System.out.println("ZOMBIE APOCALYPSE");

        System.out.println("\nA zombie apocalypse breaks out and you have to try your best to survive.");
        Util.pauseConsole();
        System.out.println("\nWhat path do you want to take?");
        System.out.println("1. Go search for your lost family\n2. you try to join a new group named the saviors\n3. You encounter a group named alexandria");
        int choice = Util.enterInt(1,3);

        if (choice == 1)
        {
            searchFamily();
        }
        else if (choice == 2)
        {
            theSaviors();
        }
        else if (choice == 3)
        {
            findAlexandria();
        }

    }

    //search family
    private void searchFamily()
    {
        Util.clearConsole();
        System.out.println("\nYou find a path which contains 2 lanes");
        Util.pauseConsole();
        System.out.println("Which lane will you take?");
        System.out.println("1. Go left\n2. Go right");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goLeft();
        }
        else if (choice == 2)
        {
            goRight();
        }
    }
    private void goLeft()
    {
        Util.clearConsole();
        System.out.println("\nYou take left and run into a group of zombies");
        Util.pauseConsole();
        System.out.println("What of the following would you choose?");
        System.out.println("1. Accept your fate\n2. Fight off the zombies with your handgun");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            acceptFate();
        }
        else if (choice == 2)
        {
            fightHerd();
        }
    }
    private void acceptFate()
    {
        Util.clearConsole();
        System.out.println("you choose the easy way out");
        Util.pauseConsole();
        System.out.println("\nYou give up and accept your fate");
        Util.pauseConsole();
        defeat();
    }
    private void fightHerd()
    {
        Util.clearConsole();
        System.out.println("\nYou manage to fight of the heard");
        Util.pauseConsole();
        System.out.println("After fighting the heard you keep moving forward");
        Util.clearConsole();
        findFamily();
    }
    private void findFamily()
    {
        Util.clearConsole();
        System.out.println("\nAfter an hour of searching, you finally find your family camping with a group of people");
        Util.pauseConsole();
        start();
    }

    private void goRight()
    {
        Util.clearConsole();
        System.out.println("\nYou take right and run into a survivor that needed help fighting off zombies, what would you do?");
        System.out.println("1. You help out the survivor\n2. You decide to ignore the survivor and ends up dying");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            homeGroup();
        }
        else if (choice == 2)
        {
            lowHonor();
        }
    }
    private void homeGroup()
    {
        Util.clearConsole();
        System.out.println("\nYou help out the worried survivor and leads you the way to his home group only to find your family camping with them");
        Util.pauseConsole();
    }
    private void lowHonor()
    {
        Util.clearConsole();
        System.out.println("\nYou decide to ignore the survivor and he ends up getting eaten by the zombies");
        Util.pauseConsole();
    }


    //the saviors
    private void theSaviors()
    {
        Util.clearConsole();
        System.out.println("\nDuring your survival, you encounter a group named the saviors and negotiating is your only option to survive");
        System.out.println("1. Negotiate with them\n2. You try to flee and run away for your own safety");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            saviorsAccepted();
        }
        else if (choice == 2)
        {
            noNegotiation();
        }
    }
    private void saviorsAccepted()
    {
        Util.clearConsole();
        System.out.println("\nThe saviors accept you into their group and now you have to pick a task to do");
        Util.pauseConsole();
        System.out.println("Which task will you choose?");
        System.out.println("1. Help patrol at night \n2. Scavenge and look for materials of good use");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            nightPatrol();
        }
        else if (choice == 2)
        {
            scavengeHunt();
        }
    }
    private void nightPatrol()
    {
        Util.clearConsole();
        System.out.println("\nWhile you are patrolling you see some zombies approaching the front gate");
        Util.pauseConsole();
        System.out.println(" Which task will you choose?");
        System.out.println("1. Shoot the zombies from a distance \n2. Go up to zombies and kill them quietly");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            shootZombie();
        }
        else if (choice == 2)
        {
            stealthZombie();
        }
    }
    private void shootZombie()
    {
        Util.clearConsole();
        System.out.println("\nShooting the zombies lead to a huge hoard of zombies because of the noise");
        Util.pauseConsole();
        System.out.println(" The savior's location got overrun with zombies leading to defeat");
        Util.pauseConsole();
        defeat();
    }
    private void stealthZombie()
    {
        Util.clearConsole();
        System.out.println("\nYou decide to walk up to the zombies slowly and stab them in the brain");
        Util.pauseConsole();
        System.out.println("Your patrol shift ends as someone new takes your spot");
        Util.pauseConsole();
    }
    private void scavengeHunt()
    {
        Util.clearConsole();
        System.out.println("\nYou try to go out and go scavenging to look for certain materials");
        Util.pauseConsole();
        System.out.println("\nYou were able to find a jerrycan of gas and some clothing accessories");
        Util.pauseConsole();
        System.out.println("You were then off gaurded by a walker that was behind you and ended up getting bit all over");
        defeat();
    }
    private void noNegotiation()
    {
        Util.clearConsole();
        System.out.println("\nThe saviors chose not to accept your deal");
        Util.pauseConsole();
        System.out.println("Which task will you choose?");
        System.out.println("1. Try to escape \n2. Put up a fight with your handgun");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            escapeSaviors();
        }
        else if (choice == 2)
        {
            fightBack();
        }
    }
    private void escapeSaviors()
    {
        Util.clearConsole();
        System.out.println("\nYou try to make your escape and out run them");
        Util.pauseConsole();
        System.out.println("\nYou run into a dead end and end up getting robbed by all of them");
        Util.pauseConsole();
        defeat();
    }
    private void fightBack()
    {
        Util.clearConsole();
        System.out.println("\nYou make an attempt to fight back using your hand gun, but it doesn't look so good since you have no ammo left");
        Util.pauseConsole();
        System.out.println("\nSince you had no ammunition the saviors made the attempt to gun you down");
        Util.pauseConsole();
        defeat();
    }

    private void findAlexandria()
    {
        Util.clearConsole();
        System.out.println("\nWhile trying to survive you encounter a large community with gated walls and tons of people, this community is named alexandria");
        Util.pauseConsole();
        System.out.println("What will you try to do?");
        System.out.println("1. Try to reason with them \n2. Attempt to rob them of their stuff");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            alexandriaAccepts();
        }
        else if (choice == 2)
        {
            attemptRobbery();
        }
    }
    private void alexandriaAccepts()
    {
        Util.clearConsole();
        System.out.println("\nThe leader of alexandria happily accepts you and gives you a house to stay in");
        Util.pauseConsole();
        System.out.println("Which house are you choosing?");
        System.out.println("1. Black house \n2. Blue house");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            blackHouse();
        }
        else if (choice == 2)
        {
            blueHouse();
        }
    }
    private void blackHouse()
    {
        Util.clearConsole();
        System.out.println("\nYou chose the black house and it is super spacious. You move all of your belongings there");
        Util.pauseConsole();
        System.out.println("\nYou live happily ever after with the people of alexandria");
        Util.pauseConsole();
        defeat();
    }
    private void blueHouse()
    {
        Util.clearConsole();
        System.out.println("\nYou chose the blue house and it is very spacious. You move all of your belongings there");
        Util.pauseConsole();
        System.out.println("\nYou live happily ever after with the people of alexandria");
        Util.pauseConsole();
        defeat();
    }
    private void attemptRobbery()
    {
        Util.clearConsole();
        System.out.println("\nYou're in need of supplies and decide to break into alexandria");
        Util.pauseConsole();
        System.out.println("Which path will you take?");
        System.out.println("1. Sneak through back gate \n2. Sneak through the front entrance");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            backGate();
        }
        else if (choice == 2)
        {
            frontGate();
        }
    }
    private void backGate()
    {
        Util.clearConsole();
        System.out.println("\nYou sneak through the back gate and find some food and water");
        Util.pauseConsole();
        System.out.println("After stealing the items carefully, you head back on the road");
        Util.pauseConsole();
    }
    private void frontGate()
    {
        Util.clearConsole();
        System.out.println("\nEven though its super risky you sneak through the front gate but sadly run into somebody");
        Util.pauseConsole();
        System.out.println("The person that caught you alerts everyone else and ends up killing you instead of letting you live");
        Util.pauseConsole();
        defeat();
    }





    private void defeat()
    {
        //run method when defeated


        //lose a life
        numLives--;

        //clear console, display text, etc
        System.out.println("You lost the game of survival, Try again to survive...");

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            start();
        }
        else
        {
            //print game over message
            System.out.println("GAME OVER!");
        }

    }
}