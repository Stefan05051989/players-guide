package Buyinginventory;
import java.util.Scanner;

public class Buyinginventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean answer = true;

        System.out.println("Welcome to the Store" );

        while (answer) {
            int product = makeChoice();
           int price = priceChecker(product);

            System.out.println("Price is " + price + " gold");

            System.out.println("Would you like to see the price of another product? ");
            String answerString = scanner.nextLine();
            if(answerString.equalsIgnoreCase("no")){
                answer = false;
            scanner.close();
            }
        }
    }

    public static int priceChecker(int choice) {
        switch (choice) {
            case 1:
                return 10;
            case 2:
                return 15;
            case 3:
                return 25;
            case 4, 7:
                return 1;
            case 5:
                return 20;
            case 6:
                return 200;
            default:
                System.out.println("That product doesnt exists");
                return 0;

        }
    }

    public static int makeChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What product would you like to see the price of?" );
        System.out.println("1 - Rope" );
        System.out.println("2 - Torches");
        System.out.println("3 - Climbing Equipment" );
        System.out.println("4 - Clean Water" );
        System.out.println("5 - Machete" );
        System.out.println("6 - Canoe" );
        System.out.println("7 - Food Supplies" );

        System.out.println("Enter the number of the product : " );
        int product = scanner.nextInt();
        scanner.nextLine();

        return product;
    }
}
