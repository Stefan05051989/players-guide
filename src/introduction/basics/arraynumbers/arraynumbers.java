package introduction.basics.arraynumbers;

public class arraynumbers {
    public static void main(String[] args){
        //invoeren van de getallen in de array
    int ages[]= new int[]{21, 34, 87, 45, 59, 67, 32, 18, 38, 35, 89, 56};
    // declareer een variabel float en sum omdat deze voor nu nog beide 0 zijn
    float avg, sum=0;
    // leeftijden moeten worden berekend middels een loop, noteer hier de code ages.length om de array op te roepen
    int length = ages.length;
    //maak nu een for loop aan, deze verwijst naar de leeftijden om ze te berekenen.
    for (int age:ages){
        sum +=age;}
    // sum = som, + leeftijd. dus de leeftijd van de volledige jaartallen in de array.
    avg = sum/length;
    // nu wordt de volledige leeftijd gedeeld door de aantallen (length) in de arrays.
        // dus : leeftijd optellen / 12 =
        System.out.println("De gemiddelde leeftijd is : "+avg);
        //sout print dan de gemiddelde leeftijd.
    }
}
