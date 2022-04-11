public class Main {

//    1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to return the rounded value of the calculation of type long.
//
//    If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
//
//            Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below.

    public static void main (String[] args) {
    printConversion(50);
    }
    public static long milesPerHour ( double kilometresPerHour){
        if (kilometresPerHour < 0) {
            return -1;
        }
        return Math.round(kilometresPerHour / 1.609);
    }
    public static void printConversion ( double kilometersPerHour){
        long milesPerHour = milesPerHour(kilometersPerHour);
        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }}