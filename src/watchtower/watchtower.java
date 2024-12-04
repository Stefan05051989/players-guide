package watchtower;

public class watchtower {
    public static void main(String[] args) {
        int x = -3;
        int y = -4;
        int wx = 0;
        int wy = 0;
        if (x > wx) {
            if (y > wy) {
                System.out.println("The enemy is north-east ");
            } else {
                System.out.println("The enemy is south-east ");
            }
        } else {
            if (y > wy) {
                System.out.println("The enemy is north-west");
            } else {
                System.out.println("The enemy is south-west");
            }
        }
    }
}