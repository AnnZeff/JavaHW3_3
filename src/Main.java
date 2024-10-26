public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int credit = 1_000_000;
        double yearPercent = 9.99; // процентная ставка по кредиту
        double monthPercent = yearPercent / (12 * 100); // месячная ставка
        int numberOfPayments = 12; // количество платежей
        double creditCoef = service.coefficient(monthPercent, numberOfPayments); // коэффициент аннуитета
        int monthPayment = service.calculate(credit, creditCoef);
        System.out.println("Месячная ставка: " + monthPercent);
        System.out.println("Кредитный коэффициент: " + creditCoef);
        System.out.println("Ежемесячный платеж составляет: " + monthPayment);
    }
}