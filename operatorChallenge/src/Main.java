public class Main {
    public static void main (String[] args){

        double firstValue = 20.00;
        double secondValue = 80.00;

        double total = (firstValue + secondValue) * 100.00;
        System.out.println(total);
        double remainder = total % 40.00d;
        System.out.println(remainder);

        if (remainder == 0){
            System.out.println("no remainder");
        } else {
            System.out.println("got some remainder");
        }
    }
}
