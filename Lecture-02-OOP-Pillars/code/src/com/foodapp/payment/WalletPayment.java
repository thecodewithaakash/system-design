package com.foodapp.payment;

import com.foodapp.model.Wallet;

// Added after Checkout was written. Checkout did not change.
public class WalletPayment extends Payment implements Refundable {
    private final Wallet wallet;

    public WalletPayment(double amount, Wallet wallet) {
        super(amount);
        this.wallet = wallet;
    }

    @Override
    public void pay() {
        wallet.pay(amount);
        System.out.println("Paid Rs " + amount + " from wallet, balance now Rs " + wallet.getBalance());
    }

    @Override
    public String getMethodName() {
        return "Wallet";
    }

    @Override
    public void refund() {
        wallet.addMoney(amount);
        System.out.println("Refunded Rs " + amount + " to wallet, balance now Rs " + wallet.getBalance());
    }
}
