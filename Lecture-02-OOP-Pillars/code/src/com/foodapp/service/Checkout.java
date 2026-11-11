package com.foodapp.service;

import com.foodapp.payment.Payment;
import com.foodapp.payment.Refundable;

// Knows only the abstractions. New payment methods never change this class.
public class Checkout {

    public void pay(Payment payment) {
        payment.pay();
        System.out.println(payment.getReceipt());
    }

    public void refund(Refundable payment) {
        payment.refund();
    }
}
