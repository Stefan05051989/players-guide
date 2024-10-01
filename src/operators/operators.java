package operators;

public class operators {
    public static void main(String[] args){
        //int x = 100 + 50; dit noem je een operator, er zijn 5 soorten operators in totaal

        int sum1 = 100 + 50; // som 1 is 100 + 50
        int sum2 = sum1 + 250;// som 2 = som1 + 250
        int sum3 = sum2 + sum2;// som 3 = som2 + som2
        System.out.println(sum1);//dit is de opdracht om sum1 uit te rekenen
        System.out.println(sum2);//dit is de opdracht om sum2 uit te rekenen
        System.out.println(sum3);//dit is de opdracht om sum3 uit te rekenen, zonder deze regels werkt de operator niet
// nu voer ik alle mogelijke opties in die te maken hebben met operators.
        int x = 10;
        int y = 5;
        System.out.println(x+y); // + is addition (toevoeging)
        System.out.println(x-y); // - is subtraction ( aftrekken)
        System.out.println(x*y); // * is multiplication (vermenigvulding)
        System.out.println(x/y); // / is division (deelt één waarde door de andere)
        System.out.println(x%y); // % is modulus (geeft het resterende van de deling terug)
        System.out.println(++x); // ++ vergroot de waarde met 1
        System.out.println(--x); // -- vermindert de waarde met 1
        // uitkomsten zijn niet allemaal correct : X = 10 en bij verminderen komt geen 9 te staan, oorzaak?
        // + uitkomst correct
        // - uitkomst correct
        // * uitkomst correct
        // / uitkomst correct
        // % geen idee of dir correct is?
        // ++ uitkomst correct
        // -- uitkomst incorrect (moet 9 zijn lijkt me)
        // nu ga ik hetzelfde doen met alles andere assignment (toewijzings) operators
        System.out.println(x + 5); // hier heb ik dezelfde optie samengevoegd in 1 operator.
        System.out.println(x + 3);
        System.out.println(x +=3);
        System.out.println(x - 3);
        System.out.println(x * 3);
        System.out.println(x / 3);
        System.out.println(x % 3);
        System.out.println(x & 3);
        System.out.println(x | 3);
        System.out.println(x ^ 3);
        System.out.println(x >> 3);
        System.out.println(x << 3);
        /* nu ga ik verder met de comparison (vergelijking) operators*/
        // hieronder staan de vergelijkingen met alle soorten
        System.out.println(x == y); // == : Equal to (gelijk aan)
        System.out.println(x != y);// != Not Equal ( niet gelijk aan)
        System.out.println(x > y); // Greater than ( groter dan)
        System.out.println(x < y); // Less than (minder dan)
        System.out.println(x >= y); // Greater than or equal to (groter dan of gelijk aan)
        System.out.println(x <= y); // Less than or equal to (minder dan of gelijk aan)
    }
}
