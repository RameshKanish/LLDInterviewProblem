package parkinglotPractise.models;

import parkinglotPractise.stategy.PaymentStategy;

public class Payment {
    private int paymentId;
    private PaymentStategy paymentStategy;
    private double amount;
    private PaymentStatus paymentStatus;
}