package thefoursisters;

import java.util.Scanner;

public class thefoursisters {
    public static void main(String[] args) {
        System.out.println("Vul in hoeveel eieren er zijn gevonden :");
        Scanner in = new Scanner(System.in);
        int numEggs = in.nextInt();
        int eggsPerSister = numEggs / 4;
        System.out.println(" each sister gets " + eggsPerSister + " egg(s) ");
        int eggsForTheDuckbear = numEggs % 4;
        System.out.println(" theDuckbearGets " + eggsForTheDuckbear + " numEgg(s) ");
        for (int eggs = 0; eggs < 100; eggs++) {
            if (eggs % 4 > eggs / 4)
            System.out.println("The duckbear gets more eggs at " + eggs + " eggs total");
        }
        in.close();
    }
}
