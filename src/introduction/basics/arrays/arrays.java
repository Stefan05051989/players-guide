package introduction.basics.arraynumbers;

public class arraynumbers {
    public static void main(String[] args);
    int ages[]= new int[]{21, 34, 87, 45, 59, 67, 32, 18, 38, 35, 89, 56};
    float avg, sum=0;
    int length = ages.length;
    for (int age:ages){
        sum + age;
        avg = sum/length;
        System.out.println("De gemiddelde leeftijd is : "+avg);
    }
}
