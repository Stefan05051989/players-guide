package opdracht16;

import java.util.Scanner;

// - Build a program that will allow a user, the pilot, to enter a number.
// - If the number is above 100 or less than 0, keep asking.
// - Clear the screen once the program has collected a good number (you can just write 50 blank lines to clear the screen :) ).
// - Ask a second user, the hunter,to guess numbers.
// - Indicate whether the user guessed too high, too low, or guessed right.
// - Loop until they get it right, then end the program.

public class theprototype {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // voer een scanner in
        int userGuess = -1;
        // declareer een startwaarde

        System.out.println("Welcome to guess the number! ");
        // start het spel
        System.out.println("Fill in the number you want the hunter to guess! ");
        int numberToGuess = scanner.nextInt();
        // vraag gebruikker nmr in te voeren dmv input tussen 0 en 100
        if (numberToGuess < 0 || numberToGuess > 100) { // als: NTG groter is dan 0, || geeft waar terug als 1 vd voorwarden klopt
            // of nummer kleiner dan 100..
            System.out.println("Enter a number between 0 and 100");
            return; // stopt het programma als het getal ongeldig is, dit moet anders maar geen idee hoe.
        }

        System.out.println("\n".repeat((25))); // de console kan niet worden gecleared, daarom voeg ik 25 lege regels in.
        System.out.println("Guess the correct number starting from 0 to 100!"); // console opdracht
        while (userGuess != numberToGuess) { // terwijl gebruikersinput != -> niet gelijk is aan -> NTG (te raden nummer...)
            System.out.println("Guess again !"); // vraag nogmaals
            if (scanner.hasNextInt()) { // als : input geldig geheel getal is
                userGuess = scanner.nextInt(); // input gebruiker : volgende int
                if (userGuess < numberToGuess) { // kleiner dan te raden nummer
                    System.out.println("Too Low! Guess again!"); // output if statement
                } else if (userGuess > numberToGuess) { // groter dan te raden nummer
                    System.out.println("Too high! Guess again!"); // output if statement
                } else { // anders :
                    System.out.println("You got it!"); // nummer geraden
                }
            } else {
                System.out.println("Invalid input, guess again"); // deze wil ik eigenlijk naar boven schuiven omdat het logischer is dan aan het einde.
                scanner.next();
                return; // enige waar nog een fout in zit is de return functie bij het
            }
        }
        scanner.close(); // sluit scanner
    }
}

/*
Ik heb geprobeerd om via de ANSI escape codes de console te clearen, dit was niet mogelijk omdat (waarschijnlijk)
INTELLJ dit niet ondersteund.

Ik heb wel via CMD commandprompt (administrator) de instellingen op mijn laptop aangepast,
hierdoor zou mijn laptop de ANSI codes wel moeten kunnen lezen. Echter heb ik een andere IDE nodig om dit te controleren.
private static void clearScreen() {
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
 */