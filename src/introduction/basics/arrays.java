package introduction.basics;

public class arrays {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Honda"};
        System.out.println(cars[3]);
        /*het tellen begint met 0, dus 0 is volvo, 1 is BMW, etc.
        Om de waarde van een specifiek element te wijzigen, verwijs naar het indexnummer, in dit geval 3.
         */
        cars[0] = "Opel";
        System.out.println(cars[0]);
        // print Opel, maar als je deze verandert naar 1 print die alsnog BMW, vanuit de originele array.
        /* Om erachter te komen hoeveel elementen de array bevat, gebruikk je de length eigenschap.
        zoals hieronder.
         */
        System.out.println(cars.length);
        /*
        print 5, opel zit niet in de originele verwijzing dus deze pakt die niet in het totaal.
        Wordt wel uitgeprint door de sout code.
        volgende onderwerp ; loop
         */
        // dit is de basis van de loop!
        {
            for (int i =0; i< cars.length; i++){
                System.out.println(cars[i]);
        /*deze opdracht print nu alles in de oorspronkelijke array, op volgorde, per regel naar beneden
        Hij gaat dus het hele programma door en herkend alles wat in de string is opgegeven.
         */
            }
        }
        }
    }
