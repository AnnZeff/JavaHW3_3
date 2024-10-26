public class CreditPaymentService {
    public double coefficient(double monthPercent, int nomberOfPayment) {
        double creditCoef = monthPercent * Math.pow((1 + monthPercent), nomberOfPayment) / (Math.pow((1 + monthPercent), nomberOfPayment) - 1);
        return creditCoef;
    }

    public int calculate(int credit, double creditCoef) {
        int monthPayment;

        return monthPayment = (int) (credit * creditCoef);
    }

}
