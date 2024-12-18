package opdracht20;
import java.util.Scanner;

/*
Make a method with the signature int askForNumber(String text). Display the text parameter in the console window,
get a response from the user, convert it to an int, and return it.
This might look like this: int result = askForNumber(“What is the airspeed velocity
of an unladen swallow?”);.
Make a method with the signature int askForNumberInRange(String text, int min, int max). Only return if the entered
number is between the min and max values. Otherwise, ask again.
Place these methods in at least one of your previous programs to improve it.
 */
public class opdracht20 {
    public static void main(String[] args) {
        Scanner askForNumber = new Scanner(System.in);
        String text = "What is the airspeed velocity of an unloaden swallow?";
        System.out.println(text);
        String myInput = askForNumber.nextLine();
        askForNumber();
        askForNumberInRange(myInput, 0, 187);
    }

    public static int askForNumber() {
        Scanner askForNumber = new Scanner(System.in);
        System.out.println("Take a guess for maximum speeds : ");
        return Integer.valueOf((askForNumber.nextInt()));
    }

    public static int askForNumber(String text, @NotNull Scanner scanner) {
        int number;
        while (true) {
            try {
                System.out.println(text);
                String input = scanner.nextLine();
                number = Integer.parseInt(input);
                return number;
            } catch (NumberFormatException e) {
                System.out.println("No valid input, enter a number between 0 and 287");
            }
        }
    }
}