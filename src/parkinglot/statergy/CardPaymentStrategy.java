package parkinglot.statergy;

import parkinglot.models.PaymentStatergy;

public class CardPaymentStrategy implements PaymentStatergy {
    @Override
    public void makePay(double amount) {
        System.out.println("Processing the amount using card - > " + amount);
    }
}