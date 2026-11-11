package com.foodapp.quiz.q10;

// Frame 10 PREDICT. Line A prints the UPI version. Line B does not compile.
// Uncomment line B to show the compile error live.
public class Quiz10Upcasting {
    public static void main(String[] args) {
        Payment p = new UpiPayment(500, "rahul@okaxis");
        p.pay();                              // line A
        // System.out.println(p.getUpiId());  // line B
    }
}
