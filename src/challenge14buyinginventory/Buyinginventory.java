package challenge14buyinginventory;
import java.util.Objects;
import java.util.Scanner;

public class Buyinginventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean answer = true;

        System.out.println("Welcome to the Store" );

        while (answer) {
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

            switch (product){
                case 1 :
                    System.out.println("10 Gold " );
                break;
                case 2 :
                    System.out.println("15 Gold " );
                break;
                case 3 :
                    System.out.println("25 Gold " );
                break;
                case 4:
                    System.out.println("1 Gold" );
                break;
                case 5 :
                    System.out.println("20 Gold" );
                break;
                case 6:
                    System.out.println("200 Gold" );
                case 7 :
                    System.out.println("1 Gold" );

            }
            System.out.println("Would you like to see the price of another product? ");
            String answerString = scanner.nextLine();
            if(answerString.equalsIgnoreCase("no")){
                answer = false;
            scanner.close();
            }
        }
    }
}
