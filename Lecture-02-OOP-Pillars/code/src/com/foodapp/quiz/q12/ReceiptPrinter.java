package com.foodapp.quiz.q12;

class ReceiptPrinter {

    void print(Payment p) {
        System.out.println("Generic receipt");
    }

    void print(UpiPayment p) {
        System.out.println("UPI receipt");
    }
}
