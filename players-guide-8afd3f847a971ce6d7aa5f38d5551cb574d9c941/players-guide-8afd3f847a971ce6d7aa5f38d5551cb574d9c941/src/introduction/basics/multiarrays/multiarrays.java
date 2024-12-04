package introduction.basics.multiarrays;

public class multiarrays {
    public static void main(String[] args){
        // dit zijn dubbele arrays, deze kan je selecteren door de kolom en het nummer aan te kaarten.
        int[][][][] myNumbers = {{{{1,2,3,4},{5,6,7,8},{9,10,11,12,13,14},{15,16,17,18,19}}}};
        System.out.println(myNumbers[1][2][3][4]);
        //opzettelijk 4 kolommen laten staan, werken niet : out of bounds melding. onderzoeken wat dit is
    }
}
