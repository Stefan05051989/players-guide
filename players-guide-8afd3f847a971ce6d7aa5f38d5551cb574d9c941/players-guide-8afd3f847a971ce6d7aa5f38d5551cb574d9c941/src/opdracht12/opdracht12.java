package opdracht12;
import java.util.*;
/*
Take a number as input from the console.
Display the word “Tick” if the number is even. Display the word “Tock” if the number is odd.
Hint: Remember that you can use the remainder operator to determine if a number is even or odd.
 */

public class opdracht12 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Voer een nummer in: ");
        int nummer = scanner.nextInt();{
            if (nummer % 2 == 0){
                System.out.println("Tick");
            } else {
                System.out.println("Tock" );
            }
            scanner.close();
        }
    }


}
