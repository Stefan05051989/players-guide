package thevariableshop;

public class thevariableshop {
    public static void main(String[] args) {
        byte myByte =126;// getal tussen de -128 en 127
        short myShort =32766; // getal tussen de -32,768 en 32,767
        int myNum = -2147483647; // getal tussen de -2147383648 en 2147483647
        long myLong =9223372036854775806L; // getal tussen de -9223372036854775806 en 9223372036854775807
        float myFloat = 1.1234567F;// decimale getallen tot 6 of 7 achter de komma
        double myDouble = 0.000000000000001;// decimale en fractie getallen tot 15 achter de komma
        boolean myBoolean = true; // waar of niet waar
        char myChar = 224;// 224 = ä alleenstaande letters of ASCII (ASK-EE sjabloon) waardes
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myNum);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myBoolean);
        System.out.println(myChar);
    }
}