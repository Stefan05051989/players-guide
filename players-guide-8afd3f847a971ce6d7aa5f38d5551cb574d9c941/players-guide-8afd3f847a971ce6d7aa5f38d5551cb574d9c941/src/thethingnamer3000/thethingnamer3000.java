package thethingnamer3000;

import java.util.Scanner;

public class thethingnamer3000 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What kind of thing are we talking about?! ");
        String thing = input.nextLine(); // uitvoer naar console
        System.out.println("How would you discribe it? Big, Tattered, Azure? ");
        String a = input.nextLine(), b = input.nextLine(); // waarom moet ik 2 keer op enter drukken?!
        System.out.println("The " + thing + " " + a + " " + b +  "of Doom! ");
        /*
        simpelweg om de opdracht uit te voeren
         */

    }

}
