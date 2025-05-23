package parkinglot.statergy;

import parkinglot.models.PaymentStatergy;

public class UPIPaymentStategy implements PaymentStatergy {

    @Override
    public void makePay(double amount) {
        System.out.println("Amount Debited from your UPI " + amount);
    }
}