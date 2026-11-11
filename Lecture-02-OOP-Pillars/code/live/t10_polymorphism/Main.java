package t10_polymorphism;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UpiPayment upi = new UpiPayment(410, "rahul@okaxis");
        CardPayment card = new CardPayment(250, "4111111111114242");
        CashOnDelivery cash = new CashOnDelivery(180);

        Payment p = upi;
        // p.getUpiId();   // compile error: a Payment variable has no getUpiId()


        List<Payment> payments = List.of(upi, card, cash);
        for (Payment payment : payments) {
            payment.pay();
            System.out.println(payment.getReceipt());
        }

        for (Payment payment : payments) {                              // new
            if (payment instanceof UpiPayment) {                        // new
                UpiPayment upiPayment = (UpiPayment) payment;           // new
                System.out.println("UPI id: " + upiPayment.getUpiId()); // new
            }                                                           // new
        }                                                               // new
    }
}
