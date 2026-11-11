package com.foodapp.quiz.q12;

// Frame 12 PREDICT. Expected output: Generic receipt
// The overload is picked at compile time from the variable's type (Payment).
public class Quiz12Overloading {
    public static void main(String[] args) {
        Payment p = new UpiPayment();
        new ReceiptPrinter().print(p);
    }
}
