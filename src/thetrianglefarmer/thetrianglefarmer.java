package thetrianglefarmer;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner; // om de opdracht uit te kunnen voeren moet de scanner worden ingevoerd

public class thetrianglefarmer {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in); // hiermee is de scanner actief
    //hierna wordt de basis van de driehoek berekend
    System.out.println("base");
    double base = scanner.nextDouble();
    // hierna wordt de hoogte van de driehoek berekend
    System.out.println("height");
    double height = scanner.nextDouble();
    //nu voer je de oppervlakte van de driehoek in
    System.out.println("result");
    double area = (base * height) / 2;
    System.out.println("de oppervlakte van de driehoek is:" + area);
    }
}
