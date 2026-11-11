package com.foodapp.payment;

public class CardPayment extends Payment implements Refundable {
    private final String cardNumber;

    public CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        System.out.println("Paid Rs " + amount + " using card ending " + lastFourDigits());
    }

    @Override
    public String getMethodName() {
        return "Card";
    }

    @Override
    public void refund() {
        System.out.println("Refunded Rs " + amount + " to card ending " + lastFourDigits());
    }

    private String lastFourDigits() {
        return cardNumber.substring(cardNumber.length() - 4);
    }
}
