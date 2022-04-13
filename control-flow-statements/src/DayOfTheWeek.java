public class DayOfTheWeek {
    public static void main (String[] args){
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(4);
        printDayOfWeek(7);

    }
    public static void printDayOfWeek (int day){
        switch(day){
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
            break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }

}
