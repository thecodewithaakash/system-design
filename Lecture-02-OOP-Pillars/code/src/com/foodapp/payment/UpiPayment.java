package com.foodapp.payment;

public class UpiPayment extends Payment implements Refundable {
    private final String upiId;

    public UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Paid Rs " + amount + " using UPI " + upiId);
    }

    @Override
    public String getMethodName() {
        return "UPI";
    }

    @Override
    public void refund() {
        System.out.println("Refunded Rs " + amount + " to " + upiId);
    }

    public String getUpiId() {
        return upiId;
    }
}
