package thevariableshopreturns;

public class thevariableshopreturns {
    public static void main(String[] args){
        byte myByte = -128; // gebruik voor kleinere getallen wanneer geheugenruimte belangrijk is
        short myShort = -32768;// voor iets groter dan byte wanneer geheugenbeperking nog steeds een rol speelt
        int myInt = -2147483648;//voor standaard numerieke operaties zonder geheugenbeperkingen
        long myLong = -9223372036854775808L;//voor zeer grote getallen die buiten int waarde vallen, eindigen met L
        float myFloat = 1.1234567f;//voor decimale waarden, afsluiten met f!
        double myDouble = 1.123456789101112; // voor grote en meer precieze waarden
        boolean myBoolean = false;// war of onwaar
        char myChar = 'Z';// Voor opslaan van enkele karakters of volgens de ASCII tabel

        // nu voer ik de aangepaste waarden uit volgens System.out.printLn (sout snelcode)

        System.out.println("Oorspronkelijke waarden");
        System.out.println("byte"  + myByte);
        System.out.println("short"  + myShort);
        System.out.println("int"  + myInt);
        System.out.println("long"  + myLong);
        System.out.println("float"  + myFloat);
        System.out.println("double"  + myDouble);
        System.out.println("boolean"  + myBoolean);

        // tonen van de nieuwe waarden
        myByte = 100;
        myShort = 1500;
        myInt = 40000;
        myLong = 922337236854775807l;
        myFloat = 9.1234567f;
        myDouble = 10000.1234567891011;
        myBoolean = true;
        myChar = 'S';

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myBoolean);
        System.out.println(myChar);

    }
}
