package TheReplicatorofDTo;
/*Make a program that creates an array of length 5.
Ask the user for five numbers and put them in the array.
Make a second array of length 5.
Use a loop to copy the values out of the original array and into the new one.
Display the contents of both arrays one at a time to illustrate that the Replicator of D’To works again.
 */

import java.util.*;

public class TheReplicatorofDTo {
    public static void main(String[] args) {
        int[] replicator = {12,13,14,15,16};// definitie array 1
        int[] replicator2 = {5,6,7,8,9}; // definitie array 2
        for (int i = 0; i < 5; i++){ // loop i = replicator 1 en 2,
            replicator2[i] = replicator[i];
        }
        System.out.println(Arrays.toString(replicator2)); // convert array (int vorm) to string(methode)
    }
}
