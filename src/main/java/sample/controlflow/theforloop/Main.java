package sample.controlflow.theforloop;

public class Main {

    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestRate = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestRate);
        }

        for (double i = 7.5; i <= 10; i += 0.25) {
            double interestRate = calculateInterest(100.00, i);
            if (interestRate > 8.5) {
                break;
            }
            System.out.println("$100.00 at " + i + "% interest = $" + interestRate);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
