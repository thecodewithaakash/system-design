package com.foodapp.quiz.q11;

class CardPayment extends Payment {
    private final String cardNumber;

    CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Paid Rs " + amount + " using card " + cardNumber);
    }
}
