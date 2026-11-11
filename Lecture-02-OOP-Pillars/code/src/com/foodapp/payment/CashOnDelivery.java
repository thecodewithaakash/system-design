package com.foodapp.payment;

// Not Refundable: cash can't be sent back through the app
public class CashOnDelivery extends Payment {

    public CashOnDelivery(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Collect Rs " + amount + " in cash at the door");
    }

    @Override
    public String getMethodName() {
        return "Cash on delivery";
    }
}
