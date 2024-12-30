package opdracht21;
/*
 instructions : rewrite the following code, which counts down from 10 to 1, with no loops
for (int x = 10; x > 0; x--)
            System.out.println(x);
 */

public class opdracht21 {
    public static void main(String[] args) {
        for (int x = 10; x > 0; x--) // dit is de loop die omgezet moet worden naar een recursive methode
            System.out.println(x);
        int result = sum(10); // dit is de som van 1 tot 10 : 1 + 2 + 3 + 4 etc
        System.out.println("Opsomming " + " " + result); // result = sum
    }
    public static int sum(int k){
        if(k == 0){ // wanneer k (gelijk is aan ==) 0, dan;
            return 0; // geef 0 terug
        } else { // wanneer dit niet zo is dan ;
            return k + sum(k -1); // k (10) + som (-1) tot 0 (10 + 9 + 8 + 7 etc)
        }
    }
}

