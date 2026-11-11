package com.foodapp.quiz.q10;

class UpiPayment extends Payment {
    private final String upiId;

    UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void pay() {
        System.out.println("Paid Rs " + amount + " using UPI " + upiId);
    }

    String getUpiId() {
        return upiId;
    }
}
