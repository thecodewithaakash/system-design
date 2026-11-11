package com.foodapp.quiz.q06;

// Frame 06 PREDICT. Expected output: Generic payment
public class Quiz06MissingOverride {
    public static void main(String[] args) {
        CardPayment card = new CardPayment();
        System.out.println(card.getDetails());
    }
}
