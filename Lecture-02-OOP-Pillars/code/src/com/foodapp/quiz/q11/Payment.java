package com.foodapp.quiz.q11;

abstract class Payment {
    protected final double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void pay();
}
