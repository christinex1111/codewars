public class bouncingBalls {
    public static int bounce(double h, double bounce, double window) {
        int countSeen = 1;

        while (h > 0) {
            h *= bounce;
            if (h > window) {
                countSeen += 2;
            } else {
                break;
            }
        }
        return countSeen;
    }
    public static void main(String[] args) {
        System.out.println(bouncingBalls.bounce(3.0,0.66,1.5));
    }
}