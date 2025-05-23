package parkinglot.models;

public class Payment {
    private double amount;
    private PaymentStatergy paymentStatergy;

    public Payment(int amount , PaymentStatergy paymentStatergy){
        this.amount = amount;
        this.paymentStatergy = paymentStatergy;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStatergy getPaymentStatergy() {
        return paymentStatergy;
    }

    public void setPaymentStatergy(PaymentStatergy paymentStatergy) {
        this.paymentStatergy = paymentStatergy;
    }

    public void processPayment (){
        if(this.amount > 0){
            paymentStatergy.makePay(this.amount);
        }else{
            System.out.println("Invalid amount ");
        }
    }
}