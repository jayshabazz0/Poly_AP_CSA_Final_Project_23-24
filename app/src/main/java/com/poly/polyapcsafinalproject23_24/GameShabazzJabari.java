package com.poly.polyapcsafinalproject23_24;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Scanner;

public class GameShabazzJabari extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure

    private TextView tvTitle, tvSubtitle, tvStoryText;

    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private boolean isWon;
    private int numLives;

    protected void run() {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("ZOMBIE APOCALYPSE");
        tvSubtitle.setText("High school edition");
    }


    public void run()
    {
        //initialize number of lives
        numLives = 5;


        //create a player object (optional)
        //player = new Player(...)

        //display project title and description

        System.out.println("ZOMBIE APOCALYPSE!");
        System.out.println("A zombie apocalypse breaks out and you have to decide on what path you want to take for your own survival.");


        start();
    }

    private void start()
    {

        System.out.println("ZOMBIE APOCALYPSE");

        System.out.println("\nA zombie apocalypse breaks out and you have to try your best to survive.");

        System.out.println("\nWhat path do you want to take?");
        System.out.println("1. Go search for your lost family\n2. you try to join a new group named the saviors\n3. You encounter a group named alexandria");


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

        System.out.println("\nYou find a path which contains 2 lanes");

        System.out.println("Which lane will you take?");
        System.out.println("1. Go left\n2. Go right");


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

        System.out.println("\nYou take left and run into a group of zombies");

        System.out.println("What of the following would you choose?");
        System.out.println("1. Accept your fate\n2. Fight off the zombies with your handgun");


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

        System.out.println("you choose the easy way out");

        System.out.println("\nYou give up and accept your fate");

        defeat();
    }
    private void fightHerd()
    {

        System.out.println("\nYou manage to fight of the heard");

        System.out.println("After fighting the heard you keep moving forward");

        findFamily();
    }
    private void findFamily()
    {

        System.out.println("\nAfter an hour of searching, you finally find your family camping with a group of people");

        start();
    }

    private void goRight()
    {

        System.out.println("\nYou take right and run into a survivor that needed help fighting off zombies, what would you do?");
        System.out.println("1. You help out the survivor\n2. You decide to ignore the survivor and ends up dying");


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

        System.out.println("\nYou help out the worried survivor and leads you the way to his home group only to find your family camping with them");

    }
    private void lowHonor()
    {

        System.out.println("\nYou decide to ignore the survivor and he ends up getting eaten by the zombies");

    }


    //the saviors
    private void theSaviors()
    {

        System.out.println("\nDuring your survival, you encounter a group named the saviors and negotiating is your only option to survive");
        System.out.println("1. Negotiate with them\n2. You try to flee and run away for your own safety");


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

        System.out.println("\nThe saviors accept you into their group and now you have to pick a task to do");

        System.out.println("Which task will you choose?");
        System.out.println("1. Help patrol at night \n2. Scavenge and look for materials of good use");


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

        System.out.println("\nWhile you are patrolling you see some zombies approaching the front gate");

        System.out.println(" Which task will you choose?");
        System.out.println("1. Shoot the zombies from a distance \n2. Go up to zombies and kill them quietly");


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

        System.out.println("\nShooting the zombies lead to a huge hoard of zombies because of the noise");

        System.out.println(" The savior's location got overrun with zombies leading to defeat");

        defeat();
    }
    private void stealthZombie()
    {

        System.out.println("\nYou decide to walk up to the zombies slowly and stab them in the brain");

        System.out.println("Your patrol shift ends as someone new takes your spot");

    }
    private void scavengeHunt()
    {

        System.out.println("\nYou try to go out and go scavenging to look for certain materials");

        System.out.println("\nYou were able to find a jerrycan of gas and some clothing accessories");

        System.out.println("You were then off gaurded by a walker that was behind you and ended up getting bit all over");
        defeat();
    }
    private void noNegotiation()
    {

        System.out.println("\nThe saviors chose not to accept your deal");

        System.out.println("Which task will you choose?");
        System.out.println("1. Try to escape \n2. Put up a fight with your handgun");


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

        System.out.println("\nYou try to make your escape and out run them");

        System.out.println("\nYou run into a dead end and end up getting robbed by all of them");

        defeat();
    }
    private void fightBack()
    {

        System.out.println("\nYou make an attempt to fight back using your hand gun, but it doesn't look so good since you have no ammo left");

        System.out.println("\nSince you had no ammunition the saviors made the attempt to gun you down");

        defeat();
    }

    private void findAlexandria()
    {

        System.out.println("\nWhile trying to survive you encounter a large community with gated walls and tons of people, this community is named alexandria");

        System.out.println("What will you try to do?");
        System.out.println("1. Try to reason with them \n2. Attempt to rob them of their stuff");


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

        System.out.println("\nThe leader of alexandria happily accepts you and gives you a house to stay in");

        System.out.println("Which house are you choosing?");
        System.out.println("1. Black house \n2. Blue house");


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

        System.out.println("\nYou chose the black house and it is super spacious. You move all of your belongings there");

        System.out.println("\nYou live happily ever after with the people of alexandria");

        defeat();
    }
    private void blueHouse()
    {

        System.out.println("\nYou chose the blue house and it is very spacious. You move all of your belongings there");

        System.out.println("\nYou live happily ever after with the people of alexandria");

        defeat();
    }
    private void attemptRobbery()
    {

        System.out.println("\nYou're in need of supplies and decide to break into alexandria");

        System.out.println("Which path will you take?");
        System.out.println("1. Sneak through back gate \n2. Sneak through the front entrance");


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

        System.out.println("\nYou sneak through the back gate and find some food and water");

        System.out.println("After stealing the items carefully, you head back on the road");

    }
    private void frontGate()
    {

        System.out.println("\nEven though its super risky you sneak through the front gate but sadly run into somebody");

        System.out.println("The person that caught you alerts everyone else and ends up killing you instead of letting you live");

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