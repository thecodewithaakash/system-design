package com.foodapp;

import com.foodapp.enums.DeliveryType;
import com.foodapp.model.MenuItem;
import com.foodapp.model.Order;
import com.foodapp.model.Wallet;
import com.foodapp.payment.CardPayment;
import com.foodapp.payment.CashOnDelivery;
import com.foodapp.payment.Payment;
import com.foodapp.payment.UpiPayment;
import com.foodapp.payment.WalletPayment;
import com.foodapp.service.Checkout;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(DeliveryType.STANDARD);
        order.addItem(new MenuItem("Masala Dosa", 120));
        order.addItem(new MenuItem("Paneer Tikka", 250));
        System.out.println(order);

        try {
            order.getItems().clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("getItems() is read-only. Items can only change through the order.");
        }

        Wallet wallet = new Wallet();
        wallet.addMoney(1000);

        UpiPayment upi = new UpiPayment(order.getTotalAmount(), "rahul@okaxis");
        CardPayment card = new CardPayment(250, "4111111111114242");
        CashOnDelivery cash = new CashOnDelivery(180);
        WalletPayment walletPayment = new WalletPayment(400, wallet);

        List<Payment> payments = List.of(upi, card, cash, walletPayment);

        Checkout checkout = new Checkout();
        System.out.println();
        for (Payment payment : payments) {
            checkout.pay(payment);
        }

        System.out.println();
        System.out.println("Two orders were cancelled:");
        checkout.refund(upi);
        checkout.refund(walletPayment);
        // checkout.refund(cash);   // compile error: CashOnDelivery is not Refundable
    }
}
