package consolasandtim;

import java.util.Scanner; // importeer scanner class

public class consolasandtim {

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); // creeer scanner opject met deze regel

        System.out.println("voor wie is het brood");
        String naam = myObj.nextLine();
        System.out.println("voor degene naast u " + naam);
    }
}