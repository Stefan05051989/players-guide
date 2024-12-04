package dominionofkings;
import java.util.Scanner;

public class dominionofkings {
    public static void main(String[] args){
        System.out.println("Wat is Uw Naam 1Celik 2Malik 3Basik? :");
        Scanner in = new Scanner(System.in);
        String myName = in.nextLine();
        System.out.println("Hoeveel landgoederen bezit U?");
        int myEstate = in.nextInt();
        in.nextLine();
        System.out.println("Hoeveel Hertogdommen bezit U?");
        int myDuchies = in.nextInt();
        in.nextLine();
        System.out.println("Hoeveel Provincies bezit U?");
        int myProv = in.nextInt();
        in.nextLine();
        System.out.println(myEstate + myDuchies * 3 + myProv * 6);
    }
}
