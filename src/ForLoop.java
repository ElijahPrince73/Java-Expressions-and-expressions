public class ForLoop {
    public static void main(String[] args) {
        for(int counter = 1;  counter <= 5; counter++) {
            System.out.println(counter);
        }
        for (double rate = 2.0; rate <= 5; rate++) {
            double interestAmount = calcInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + " interest = " + interestAmount);
        }

        for(double rate = 7.5; rate <= 10; rate = (rate + 0.25)) {
            System.out.println(rate);
        }
    }

    public static double calcInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
