package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    /*###################################################################################################
    * Try the following exercises:
    * Write a Java program to create a new array list to hold colors.
    * Add at least 3 colors (string) to the array list and print out all its values.
    * Using the array list created above, print out the value at index 1.
    * Using the array list above, prompt the user for one new color, and add that color to the array list.
    * Using the array list, continue prompting the user for colors until they type in "Q" or "q" to quit.
    * Each time the user enters a color, add that to the array list. Print out the list at the end.
    #####################################################################################################*/
    public static void main(String[] args) {
        String answer="n";
        ArrayList<String> colors = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        colors.add("Yellow");
        colors.add("Brown");
        colors.add("Purple");
        System.out.print("All the colors are: ");
        for(String color: colors){
            System.out.printf("%s ",color);
        }
        System.out.println();
        while(!answer.equalsIgnoreCase("q")){
            if(!answer.equalsIgnoreCase("q")){
                System.out.print("Enter color: ");
                colors.add(input.nextLine());
            }
            System.out.print("Do you want to quit?(q/n) ");
            answer = input.nextLine();
        }
        System.out.printf("The value at index 1 is %s\n", colors.get(1));
        System.out.print("All the colors are: ");
        for(String color: colors){
            System.out.printf("%s ",color);
        }

        System.out.println();
    }
}
