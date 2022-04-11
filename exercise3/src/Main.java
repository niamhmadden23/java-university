public class Main {
    public static void main(String[] args) {
        shouldWakeUp(true, 12);
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (isBarking && hourOfDay < 8 || hourOfDay > 22) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return isBarking;
    }
}
