package defense;
import java.awt.Toolkit;
import java.util.Scanner;

public class defense{
    // de kleurcodes moeten BUITEN de main worden gedeclareerd, anders error. (meer kleurcodes?)
    public static final String Reset  = "\u001B[0m";
    public static final String Red = "\u001B[31m";
    public static final String Green = "\u001B[32m";
    public static final String Yellow = "\u001B[33m";
    public static final String Blue = "\u001B[34m";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which row will the attack be in");
        int row = scanner.nextInt();
        System.out.println("Which col will the attack be in");
        int col = scanner.nextInt();
        // nu moeten de instructies in een andere kleur worden gegeven!
        System.out.println(Red + "(" + row + ", " + (col+1) + ")" + Reset);
        System.out.println(Green + "(" + row + ", " + (col-1) + ")" + Reset);
        System.out.println(Yellow + "(" + (row+1) + ", " + col + ")" + Reset);
        System.out.println(Blue + "(" + (row-1) + ", " + col + ")" + Reset);
        Toolkit.getDefaultToolkit().beep();
        //dit is de toolkit dat het geluidje afspeeld, gevonden via :
        //https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
    }
}
/*
er zijn nog meer kleurcodes, dit zijn ze allemaal :
  public static final String RESET = "\u001B[0m";
    public static final String ROOD = "\u001B[31m";
    public static final String GROEN = "\u001B[32m";
    public static final String GEEL = "\u001B[33m";
    public static final String BLAUW = "\u001B[34m";
    public static final String PAARS = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WIT = "\u001B[37m";
*/