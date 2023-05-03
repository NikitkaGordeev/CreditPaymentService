public class CreditPaymentService {

    //amount - сумма кредита
    //period - срок кредита
    //percent - процентная ставка
    //monthlyPayment - месячный платеж
    //monthPercent - - месячный кредитный процент, одна сотая от годовой процентной ставки в месяц


    public double calculator(double amount, double period, double percent) {
        double monthPercent = percent / 100 / 12;
        double monthlyPayment = amount * (monthPercent + (monthPercent) / (Math.pow(1 + monthPercent, period) - 1));
        return monthlyPayment;
    }
}
