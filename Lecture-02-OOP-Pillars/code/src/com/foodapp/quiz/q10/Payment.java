package com.foodapp.quiz.q10;

abstract class Payment {
    protected final double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void pay();
}
