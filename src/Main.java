public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amount = 1_000_000; // сумма кредита
        double percent = 9.99; // годовой процент
        double oneYears = service.calculator(amount, 12, percent);
        int twelveMonth = (int) oneYears;
        System.out.println("Ежемесячный платеж составляет: " + twelveMonth + " руб");

        double twoYears = service.calculator(amount, 24, percent);
        int twentyFourMonth = (int) twoYears;
        System.out.println("Ежемесячный платеж составляет: " + twentyFourMonth + " руб");

        double threeYears = service.calculator(amount, 36, percent);
        int thirtyFourMonth = (int) threeYears;
        System.out.println("Ежемесячный платеж составляет: " + thirtyFourMonth + " руб");


    }
}