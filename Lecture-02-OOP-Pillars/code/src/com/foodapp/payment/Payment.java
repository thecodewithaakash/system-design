package com.foodapp.payment;

public abstract class Payment {
    private static int paymentCounter = 0;

    private final int paymentId;
    protected final double amount;

    protected Payment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        paymentCounter++;
        this.paymentId = paymentCounter;
        this.amount = amount;
    }

    public abstract void pay();

    public abstract String getMethodName();

    // final: every payment must print the same receipt format
    public final String getReceipt() {
        return "Receipt #" + paymentId + ": Rs " + amount + " via " + getMethodName();
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }
}
