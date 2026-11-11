package com.foodapp.quiz.q11;

// Frame 11 PREDICT. It compiles, then crashes with ClassCastException.
public class Quiz11Downcasting {
    public static void main(String[] args) {
        Payment p = new CardPayment(250, "4111111111114242");
        UpiPayment upi = (UpiPayment) p;
        System.out.println("Cast worked");
    }
}
